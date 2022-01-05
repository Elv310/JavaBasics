package com.company;

public class NameGenerator {
public String firstName;
public String lastName;

    public NameGenerator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String generateFullName(String firstName , String lastName){
    return firstName + " " + lastName;
    }
}
