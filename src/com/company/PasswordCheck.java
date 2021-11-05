package com.company;

public class PasswordCheck
{
    static int length = 0;
    static int vowel = 0;
    static int number = 0;
    static int special = 0;
    static int capital = 0;
    static int doubleLetter = 0;

    public static void hasVowel(String pwd)
    {
        vowel = 0;
        char c;
        for (int i = 0; i < pwd.length(); i++)
        {
            c = pwd.charAt(i);
            switch (c)
            {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> vowel++;
            }
        }
    }

    public static void hasNumber(String pwd)
    {
        char c;
        number = 0;
        for (int i = 0; i < pwd.length(); i++)
        {
            c = pwd.charAt(i);
            if (Character.isDigit(c))
            {
                number++;
            }
        }
    }

    public static void length(String pwd)
    {
        length = 0;
        if (pwd.length() > 10)
        {
            length++;
        }
    }

    public static void special(String pwd)
    {
        char c;
        special = 0;
        for (int i = 0; i < pwd.length(); i++)
        {
            c = pwd.charAt(i);
            switch (c)
            {
                case '~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=',
                        '+', '{', '[', ']', '}', '|', ':', ';', '"', ',', '.', '/', '<', '>', '?' -> special++;
            }
        }
    }

    public static void capital(String pwd)
    {
        char c;
        capital = 0;
        for (int i = 0; i < pwd.length(); i++)
        {
            c = pwd.charAt(i);
            if (Character.isUpperCase(c))
            {
                capital++;
            }
        }
    }

    public static void doubleLetter(String pwd)
    {
        char c;
        char c2;
        char c3;
        doubleLetter = 0;
        for (int i = 0; i < pwd.length()-2; i++)
        {
            int j = i+1;
            int k = i+2;
            c = pwd.charAt(i);
            c2 = pwd.charAt(j);
            c3 = pwd.charAt(k);

            String char1 = String.valueOf(c);
            String char2 = String.valueOf(c2);
            String char3 = String.valueOf(c3);

            if (char1.equals(char2) && char2.equals(char3))
            {
                doubleLetter++;
            }
        }
    }

    public static boolean isValid()
    {
        return vowel > 0 && number > 0 && length > 0 && special > 0 && capital > 0 && doubleLetter == 0;
    }
}
