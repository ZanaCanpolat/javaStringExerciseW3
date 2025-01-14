package org.Lexicon.group54;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Variable declaration
        String testString;
        int testInt;
        String[] testStringArray;
        String splitChar;
        char[] testCharArray = new char[0];


        System.out.println("This is some simple java String exercise");

        // Checking the length of a Java string
        testString = "Java";
        System.out.println("The length of the string is: " + testString.length());

        System.out.println(); // Printing an empty line to increase visibility

        //1. Finding out which char is in a certain position
        testString = "Long example sentence";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.charAt(6) = " + testString.charAt(6));

        System.out.println(); // Printing an empty line to increase visibility

        //2. Finding out which char is in a certain position
        testString = "Even longer example sentence";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.indexOf(o) = " + testString.indexOf("o"));

        System.out.println(); // Printing an empty line to increase visibility

        //3. Creating an sub string and printing out
        testString = "Ok this is not as long!";
        System.out.println("Printing teststring = " + testString);
        System.out.println("Creating a substring = " + testString.substring(11, 22)); // there is several ways of doing this, search for the word you are looking for, keep track of position

        System.out.println(); // Printing an empty line to increase visibility

        //4. Converting caps to lowercase and back again
        testString = "CAPS EQUALS SCREAMING!";
        System.out.println("Printing teststring = " + testString);
        System.out.println("Converting all caps to lower case = " + testString.toLowerCase());
        System.out.println("Converting lowercase to caps = " + testString.toUpperCase());

        System.out.println(); // Printing an empty line to increase visibility

        //5. Switching out a word inside a string
        testString = "Java is the worst programming language!";
        System.out.println("Printing test string = " + testString);
        System.out.println("Changing a word inside a text string = " + testString.replace("worst", "best"));

        System.out.println(); // Printing an empty line to increase visibility

        //6. Switching out a word inside a string
        testString = "\t J \t a \t v \t a \t ";
        System.out.println("Printing test string = " + testString);
        //System.out.println("Changing a word inside a text string = " + testString.replace("worst", "best"));

        System.out.println(); // Printing an empty line to increase visibility

        //7. Parsing (converting one type to another) an integer in to a string
        testInt = 20;
        testString = "20";
        testString = testInt + testString; //type conversion in string
        System.out.println("Parsing an integer with a string = " + testString);

        System.out.println(); // Printing an empty line to increase visibility

        //8. Creating an string array and extruding words from an array
        // Help found at: https://www.w3schools.com/java/ref_string_split.asp there is a problem the copied code does
        // does not have the same input, ask Elnaz about why?
        testString = "Oil and Water";
        splitChar = "and";  // this code [,\.\s ´and`] says that split the words by spaces, punctuation + the word "and"
        testStringArray = testString.split(splitChar);
        for (String s : testStringArray) { // Ask about this for loop, IntelliJ changed my regular for loop to this (can not remember this)
            System.out.println("Printing out string array = " + s);
        }

        System.out.println(); // Printing an empty line to increase visibility

        //9. Creating an string array and extruding words from a string that is seperated by comma
        testString = "Carl,Susie,Fredrick,Bob,Erik";
        splitChar = ",";  // this code [,\.\s ´and`] says that split the words by spaces, punctuation + the word "and"
        testStringArray = testString.split(splitChar);
        for (String s : testStringArray) {
            System.out.println("Printing out string array = " + s);
        }

        System.out.println(); // Printing an empty line to increase visibility

        //10. Converting a string to array of characters
        testString = "ThisShouldBeConverted";
        testCharArray = testString.toCharArray();

        for (int i = 0; i < testString.length(); i++)
        {
            //System.out.println(testString.length()); //debuging
            //System.out.println("i = " + i); //debuging
            System.out.println("Char array= "  + testCharArray[i]);
            //System.out.println("i = " + i); //debugging
        }

        /*  Ask Elnaz why the code below did not work?????
        for (int i = 0; i <= testString.length(); i++ )
        {
            System.out.println("testString length = " + testString.length()); // for debug
            System.out.println("i = " + i); // for debug
            testCharArray[] = testString.toCharArray();
            System.out.println("Printing out string array = " + testStringArray[i]);
            System.out.println("i = " + i); // for debug
        }
        */

        System.out.println();

        //11. Converting array of characters to a string
        testCharArray = new char[]{'J', 'a', 'v', 'a'};
        testString = new String(testCharArray);  //converted the array of char to String using String constuctor
        //System.out.println("testCharArray.toString() = " + testCharArray.toString()); //Debug
        //testString = testCharArray.toString();    //This line gives a alphanumeric value, find out later why?
        // testString = Arrays.toString(testCharArray);     This line works but gives an output that is not desired, can remove unwanted char with split
        System.out.println("Converting array of char to string = " + testString);

    }
}