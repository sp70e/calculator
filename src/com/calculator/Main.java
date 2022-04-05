package com.calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int doubleTest = 0;
    public static String arab(String s)
    {
        String num = s;
        switch(s)
        {
            case "I": num = "1";doubleTest++; break;
            case "II": num = "2";doubleTest++;break;
            case "III": num = "3";doubleTest++;break;
            case "IV": num = "4";doubleTest++;break;
            case "V": num = "5";doubleTest++;break;
            case "VI": num = "6";doubleTest++;break;
            case "VII": num = "7";doubleTest++;break;
            case "VIII": num = "8";doubleTest++;break;
            case "IX": num = "9";doubleTest++;break;
            case "X": num = "10";doubleTest++;break;
        }
        return num;
    }
    public static void main(String[] args) {
        String[] arabic = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        int arabtest=0;
        System.out.println("Пример ввода: 1 + 2 ");
        Scanner in = new Scanner( System.in);
        String str = in.nextLine();
        int result = 0;
        String[] words = str.split(" ");
        // Разбиение строки на слова с помощью разграничителя (пробел)

        if (words.length > 3) throw new NullPointerException("error1"); // исключает вводы вида 1 + 1 + 1

        words[0] = arab(words[0]);
        words[2] = arab(words[2]);
        //System.out.println(words[0]);
        //System.out.println(words[2]);


        {
            if ((Integer.parseInt(words[0]) < 11) & (Integer.parseInt(words[0]) > 0) &
                    (Integer.parseInt(words[2]) < 11) & (Integer.parseInt(words[2]) > 0))
            {

                switch (words[1])
                {
                    case "+":
                    {
                        result = Integer.parseInt(words[0])+Integer.parseInt(words[2]);
                        break;
                    }
                    case "-":
                    {
                        result = Integer.parseInt(words[0])-Integer.parseInt(words[2]);
                        break;
                    }
                    case "*":
                    {
                        result = Integer.parseInt(words[0])*Integer.parseInt(words[2]);
                        break;
                    }
                    case "/":
                    {
                        result = Integer.parseInt(words[0])/Integer.parseInt(words[2]);
                        break;
                    }

                    default:
                        throw new NullPointerException("error3"); // не верный знак
                }


                if (doubleTest == 2)//работаем с римскими числами
                {
                    if (result > 0){
                        System.out.println(arabic[result]);} else {throw new NullPointerException("error2");}
                }

                else {
                    if (doubleTest != 1) // работаем с арабскими числами
                        System.out.println(result);
                    else throw new NullPointerException("Different num"); // введены арабское и римское число одновременно
                }}
            else {throw new NullPointerException("error5");} // диапазон чисел от 1 до 10 включительно

        }
    }
}