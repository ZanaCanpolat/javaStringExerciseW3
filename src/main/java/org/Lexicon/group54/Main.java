package org.Lexicon.group54;

public class Main
{
    public static void main(String[] args)
    {
        //Variable declaration
        String testString;
        int testInt;



        System.out.println("This is some simple java String exercise");

        // Checking the length of a Java string
        testString = "Java";
        System.out.println("The length of the string is: " +testString.length());

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
        System.out.println("Creating a substring = " + testString.substring(11,22)); // there is several ways of doing this, search for the word you are looking for, keep track of position

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

        //8. Creating an string array and adding two words from an string
        testString = "Oil and Water";
        System.out.println("Creating an string array from an string = " + testString);

    }
}