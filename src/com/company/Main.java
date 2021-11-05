package com.company;
import java.util.Scanner;
import static com.company.PasswordCheck.*;

public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Password :: ");
        String pwd = in.nextLine();
        String line = "------------------------------";

        hasVowel(pwd);
        hasNumber(pwd);
        length(pwd);
        special(pwd);
        capital(pwd);
        doubleLetter(pwd);

        System.out.println(line + "\nVowels: " + vowel + "\nNumbers: " + number +  "\nLength: " + length + "\nSpecial Characters: " + special + "\nCapital Letters: " + capital + "\nTriple Letters: " + tripleLetter);

        if (isValid())
        {
            System.out.println(line);
            System.out.println("Your Password is Secure!");
            System.out.println(line);
        } else
        {
            System.out.println(line);
            System.out.println("Your Password is NOT Secure!");
            System.out.println(line);
        }
    }
}