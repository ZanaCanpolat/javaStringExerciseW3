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

        System.out.println(); // Printin an empty line to increase visibity
        
        //Finding out which char is in a certain position
        testString = "Long example sentence";
        System.out.println("Printing teststring = " + testString);
        System.out.println("testString.charAt(6) = " + testString.charAt(6));


    }
}