package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myMobile = new MobilePhone();
    public static void main(String[] args) {
	// write your code here
        Contacts temp = new Contacts("Arnab","1000");
        myMobile.getContactList().set(0,temp);
        System.out.println(myMobile.getContactList().indexOf(temp));
        /*boolean Assess = false;
        printList();
        int count = 0;
        //scanner.nextLine();
        while (Assess == false){
            System.out.print("Enter your Choice: ");
            count = scanner.nextInt();
            switch (count){
                case 0:
                    printList();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    AddNewContact();
                    break;
                case 3:
                    ModifyContact();
                    break;
                case 4:
                    RemoveContact();
                    break;
                case 5:
                    FindAContact();
                    break;
                case 6:
                    Assess = true;
            }
        }*/

    }

    private static void FindAContact(){
        System.out.println("Enter the name of the contact you want to search");
        //scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        //scanner.nextLine();
        String number = scanner.nextLine();
        myMobile.findContact(name,number);

    }

    private static void RemoveContact(){
        System.out.println("Enter the name of the contact you want to remove: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        /*System.out.println("Enter contact number: ");
        //scanner.nextLine();*/
        //String number = scanner.nextLine();
        //myMobile.removeContact(name,number);
        String[] contactNumber = myMobile.PhoneArray();
        int position = findIndex(contactNumber,name);
        myMobile.getContactList().remove(position);

    }
    public static int findIndex(String[] arr, String t)
    {
        if(arr.length == 0){
            return -1;
        }else{
            int j = 0;
            while(j<arr.length){
                if (arr[j].equals(t)){
                    return j;
                }else{
                    j ++;
                }
            }
            return -1;
        }

    }
    private static void ModifyContact(){
        System.out.println("Enter the name of the contact you want to modify: ");
        scanner.nextLine();
        String nameOld = scanner.nextLine();
        String[] array = myMobile.NameArray();
        int position = findIndex(array,nameOld);
        System.out.println("Enter the new contact name: ");
        //scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        //scanner.nextLine();
        String number = scanner.nextLine();
        Contacts tempContact = new Contacts(name,number);
        myMobile.getContactList().set(position,tempContact);
        //myMobile.modifyContact(oldContact, name,number);
    }

    private static void AddNewContact(){
        System.out.println("Enter contact name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        //scanner.nextLine();
        String number = scanner.nextLine();
        myMobile.StoreContact(name,number);
    }

    private static void printContactList(){
        for (int i = 0; i < myMobile.getContactList().size(); i++) {
            System.out.println("Contact #"+(i+1) + " : Name: " + myMobile.getContactList().get(i).getName() + "       Contact Number: " +myMobile.getContactList().get(i).getPhoneNumber() );
        }
    }


    private static void printList(){
        System.out.println("Press: ");
        System.out.println(" 0 to get the options menu");
        System.out.println(" 1 to get the full contact list");
        System.out.println(" 2 to add a new contact");
        System.out.println(" 3 to modify a contact");
        System.out.println(" 4 to remove a contact");
        System.out.println(" 5 to find a contact");
        System.out.println(" 6 to escape");
    }
}
