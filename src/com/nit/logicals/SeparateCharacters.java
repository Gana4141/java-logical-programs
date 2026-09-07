package com.nit.logicals;
import java.util.Scanner;
public class SeparateCharacters 
{

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Original String is: " + input);

        separateCharacters(input);

        scanner.close();
    }

    public static void separateCharacters(String input)
    {

        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();

        for (char ch : input.toCharArray()) 
        {

            if (Character.isLowerCase(ch)) 
            {
                lowerCase.append(ch);
            }
            else if (Character.isUpperCase(ch))
            {
                upperCase.append(ch);
            }
        }

        System.out.println("Lowercase characters: " + lowerCase);
        System.out.println("Uppercase characters: " + upperCase);
    }
}