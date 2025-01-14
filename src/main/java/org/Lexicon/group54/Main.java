package org.Lexicon.group54;

public class Main
{
    public static void main(String[] args)
    {
        //Variable declaration
        String testString;


        System.out.println("This is some simple java String exercise");

        // Checking the length of a Java string
        testString = "Java";
        System.out.println("The length of the string is: " +testString.length());

        System.out.println(); // Printing an empty line to increase visibity
        
        //Finding out which char is in a certain position
        testString = "Long example sentence";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.charAt(6) = " + testString.charAt(6));

        System.out.println(); // Printing an empty line to increase visibility

        //Finding out which char is in a certain position
        testString = "Even longer example sentence";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.indexOf(o) = " + testString.indexOf("o"));

        System.out.println(); // Printing an empty line to increase visibility

        //Finding out which char is in a certain position
        testString = "Ok this is not as long!";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.indexOf(o) = " + testString.substring(11,22));


    }
}