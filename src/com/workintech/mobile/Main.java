package com.workintech.mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        MobilePhone phone = new MobilePhone("123123123", contactList);
        Contact cenk = new Contact("Cenk", "1234");
        phone.addNewContact(cenk);
        phone.addNewContact(new Contact("Alp", "1235"));
        phone.addNewContact(new Contact("Helin", "1236"));
        phone.addNewContact(new Contact("Ezgi", "1237"));
        phone.addNewContact(new Contact("Behlül", "1234"));
        phone.addNewContact(new Contact("Cenk", "1238"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(cenk));
        System.out.println("Index Name: " + phone.findContact("Ömer"));
        System.out.println("Query Contact: " + phone.queryContact("Ezgi"));
        System.out.println("Search Contach: " + phone.search("Cenk"));
    }
}
