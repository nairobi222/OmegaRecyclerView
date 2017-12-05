package com.omega_r.omegarecyclerview.swipe_menu_example;


import java.util.ArrayList;

public class Contacts {

    private String mName;
    private boolean mOnline;

    public Contacts(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contacts> createContactsList(int numContacts) {
        ArrayList<Contacts> contactsArrayList = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {
            contactsArrayList.add(new Contacts("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contactsArrayList;
    }

}