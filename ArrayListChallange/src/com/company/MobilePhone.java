package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> ContactList = new ArrayList<Contacts>();

    public String[] NameArray(){
        String[] array = new String[ContactList.size()];
        for (int i = 0; i < ContactList.size(); i++) {
            array[i] = ContactList.get(i).getName();
        }
        return array;
    }
    public String[] PhoneArray(){
        String[] array = new String[ContactList.size()];
        for (int i = 0; i < ContactList.size(); i++) {
            array[i] = ContactList.get(i).getPhoneNumber();
        }
        return array;
    }



    public void StoreContact(String name, String phoneNumber){
        Contacts newContact = new Contacts(name, phoneNumber);
        ContactList.add(newContact);
    }

    public void removeContact(int position){
        ContactList.remove(position);
        System.out.println("Item removed!");
    }
    public void removeContact(String name, String phoneNumber){
        Contacts newContact = new Contacts(name, phoneNumber);
        int position = ContactList.indexOf(newContact);
        if (position>=0){
            removeContact(position);
        }
    }

    public void findContact(Contacts queryContact){
        int position = ContactList.indexOf(queryContact);
        if (position>=0){
            System.out.println("Your query is at position " + position);
        }else {
            System.out.println("Your query isn't in the list");
        }
    }

    public void findContact(String name , String phoneNumbers){
        Contacts queryContact = new Contacts(name,phoneNumbers);
        findContact(queryContact);
    }

    public ArrayList<Contacts> getContactList() {
        return ContactList;
    }
}
