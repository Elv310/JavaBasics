package com.company;

public class Main {

    public static void main(String[] args) {
	String firstName = "Elvis";
	String lastName = "Aibangbee";
            String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        String createdName = Main.createFullName(firstName, lastName);
        System.out.println(createdName);
        String generatedName = NameGenerator.generateFullName(firstName , lastName);





    }


public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
}

}

