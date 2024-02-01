package org.example;

import com.google.gson.Gson;
import org.example.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Сергей", "Иванов", 25);

        String stringJson = new Gson().toJson(person);
        System.out.println("Сериализованный объект Person:");
        System.out.println(stringJson);

        Person newPerson = new Gson().fromJson(stringJson, Person.class);
        System.out.println("Десериализованный объект Person:");
        System.out.println(newPerson);


    }
}