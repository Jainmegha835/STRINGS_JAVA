package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //STRINGS
      //NOW SOME IMPORTANT CONCEPTS :-
        Scanner scanner= new Scanner(System.in);
        //Scanner--class an scanner-- reference variable (store in stack memory)
        //new Scanner--object or instance of class(stored in heap memory)
        String name="internshala";
        //s1---internshala(object)(now this name and s1 will connected to each other)

        //STRING FUNCTIONS
        char[] myarray = {'a','b','v','h','y'};
        String firststring= "welcome";
        System.out.println(myarray);
        System.out.println(myarray.length);
        System.out.println(firststring);
        System.out.println(firststring.length());//import**

        //to print character of particular index...
        System.out.println(firststring.charAt(4));

        //upper and lower case:--
        System.out.println(firststring.toUpperCase());
        System.out.println(firststring.toLowerCase());

        //to check whether string contain particular character or not
        System.out.println(firststring.contains("come"));
        //it will give output true...
        System.out.println(firststring.contains("lome"));
        //it will give output false


        //to add two strings..
        System.out.println(firststring+"to code");
        System.out.println(firststring.concat("to coding"));

        //various other operations:
        System.out.println(firststring.equalsIgnoreCase("WeLCOme"));
        //return true

        //To get the index of a particular character present in a String use
        System.out.println(firststring.indexOf('c'));
        //return 3

        //To Remove blank space if present at the beginning or at the end of string use
        System.out.println(firststring.trim());




    }
}
