# SharingApp
OOAD peer gradded capstone assignment
# Use the following updated UML class diagram to assist you with your understanding and implementation:
![image](https://user-images.githubusercontent.com/22343548/145957237-f15527b7-9734-49b9-8ee1-389eb0ef9dfc.png)


# About the application

This version of the app should accommodate the new contacts feature. In particular:

- ContactsActivity should be accessible from the MainActivity.

 ![image](https://user-images.githubusercontent.com/22343548/145955822-1e11d7b2-e837-47c6-9ee4-0b2f67ee540d.png) | ![image](https://user-images.githubusercontent.com/22343548/145955833-2a2bf303-4910-4b09-bc2c-4f896de80a5d.png)



- ContactsActivity should be implemented as a ListView.

- An owner should now be able to add a potential borrower (a contact) to their contacts. Each contact must have a unique username and an email.

![image](https://user-images.githubusercontent.com/22343548/145955882-5203515e-7c74-49a9-bfca-a44bea4f7291.png)
![image](https://user-images.githubusercontent.com/22343548/145955890-4a8c8c86-ded7-4895-8ec2-fde437d2ef1c.png)


- An owner can edit or delete a contact, but not if the contact is currently borrowing an item, i.e. the contact is a borrower.
![image](https://user-images.githubusercontent.com/22343548/145955908-0c70e6cd-eb30-456b-ae59-616209e5b6d7.png)



- Owners are now required to select a contact to be the borrower of an item when changing the status of an item from “Available” to “Borrowed”. That is, it is no longer sufficient to enter the borrower’s username as a string -- now the borrower must be picked from the owner’s list of contacts.

![image](https://user-images.githubusercontent.com/22343548/145955948-431b7bdb-0b0b-4cad-a76a-d3b6c9421023.png) | ![image](https://user-images.githubusercontent.com/22343548/145955971-72afb926-cb87-4bde-ac0b-4969e566353d.png) | ![image](https://user-images.githubusercontent.com/22343548/145955971-72afb926-cb87-4bde-ac0b-4969e566353d.png)

Submission Instructions

# Part 1 Submission 
will test your ability to translate the UML class diagram into Java code. When you are ready to submit your code, include the following two files in a folder:

- #Contact.java
- #ContactList.java

Then compress the folder into a ZIP archive. Windows users can use 7zip or WinRAR. Upload it where prompted.

# Part 2 Submission 
will test the correctness of your code

In order to grade your assignment, you will need to submit a 5 minutes or less demo video of your app that shows the following steps as a continuous interaction without crashing (if possible):

1.Start the video of your app from the MainActivity. 
2.From the MainActivity, navigate to the ContactsActivity.
3.From the ContactsActivity, add a new contact to your contact list. Show that you can enter a username and email, save this contact to your contact list. 
4.Show that by selecting (long clicking) a contact in the contact list, you can edit this contact. Update the email address of a contact.
5.Show that you can delete one of your contacts.
6.Go back to the MainActivity and look at your available Items.
7.Add an item to your inventory (if you don't already have an available item).
8.Edit an item in your inventory by long clicking on the item. Click the "Available" toggle. The toggle should now say "Borrowed" and a box should appear below to indicate the name of the borrower. By default the box will show the username of the first contact in your contacts. If you have more than one contact in your contacts you can click this box and then select the desired contact. 
9.Finally, press "Save" to return to your inventory.



https://user-images.githubusercontent.com/22343548/145966380-0c9ba13d-1c02-498c-8a08-b14cf00a64b0.mp4


.
