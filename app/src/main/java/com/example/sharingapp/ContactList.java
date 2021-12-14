package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private ArrayList<Contact> contacts;
    private String FILENAME="contacts.sav";

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contacts=contact_list;
    }
    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }


    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public int getSize() {
        return contacts.size();
    }

    public int getIndex(Contact contact) {
        int pos=0;
        for (Contact c:contacts) {
            if(c.getId().equals(contact.getId())){
                return  pos;
            }
            pos=pos+1;
        }
        return -1;
    }

    public boolean hasContact(Contact contact) {
        //NOTE:if we want to use contains method override equals & hashcode method in contact class
        // contacts.contains(contact);
        boolean hasContact=false;
        if(null!=getContactByUsername(contact.getUsername())){
            hasContact=true;
        }
        return hasContact;
    }

    public void loadContacts(Context context) {

        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contacts = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (IOException e) {
            contacts = new ArrayList<>();
        }
    }

    public void saveContacts(Context context) {
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson=new Gson();
            gson.toJson(contacts,osw);
            osw.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isUsernameAvailable(String username) {
        Contact contactByUsername = getContactByUsername(username);
        boolean isUsernameAvailable=true;
        if(null!=contactByUsername){
            isUsernameAvailable=false;
        }
        return isUsernameAvailable;
    }

    public Contact getContactByUsername(String username) {
        Contact req_contact=null;
        for (Contact c: contacts) {
            if(c.getUsername().equalsIgnoreCase(username)){
                req_contact=c;
            }
        }
        return req_contact;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> all_user_names=new ArrayList<>();
        for (Contact c: contacts) {
            String username = c.getUsername();
            if(username!=null){
                all_user_names.add(username);
            }
        }
        return all_user_names;
    }
}
