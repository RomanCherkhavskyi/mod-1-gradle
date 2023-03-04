package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Roman");
        person.setLastName("Cherkhavskyi");

        Gson gson = new Gson();

        System.out.println(gson.toJson(person));


    }
}