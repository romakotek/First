package com.company.interfaces_abstraction;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        task();
//        task1();
        task2();
    }
    public static void task2(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Type some number: ");
    int n = sc.nextInt();
    divisibleByThree(n);
    fizzString2(fizzBuzz);
    }
    public static void divisibleByThree(int n){
        int fizzBuzz;
        if ((n % 3 == 0) && (n % 5 == 0)){
            fizzBuzz = 1;
        } else if ((n % 3 != 0) && (n % 5 == 0)){
            fizzBuzz = 2;
        } else if ((n % 3 == 0) && (n % 5 != 0)){
            fizzBuzz = 3;
        } else {
            fizzBuzz = 4;
        }
    }
    public static void fizzString2(int fizzBuzz){
        switch (fizzBuzz){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("");
        }
    }
    //region task1
    public static void task1(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Type any three characters: ");
        String str = sc.nextLine();
        System.out.println(fizzString(str));
    }
    public static String fizzString(String str){
        switch (str.charAt(0)) {
            case 'f':
                switch (str.charAt(str.length() - 1)) {
                    case 'b':
                        return "FizzBuzz";
                }
        }
        switch (str.charAt(0)){
            case 'f':
                return "Fizz";
//            default:
//                return str;
        }
        switch (str.charAt(str.length()-1)){
            case 'b':
                return "Buzz";
            default:
                return str;
        }

    }
    //endregion
    //region task
   public static void task(){
        Scanner sc = new Scanner (System.in);
        System.out.println("How much tea have you got?");
        int tea = sc.nextInt();
        System.out.println("how many candies have you got?");
        int candy = sc.nextInt();
        System.out.println(teaParty(tea,candy));

    }
    public static int teaParty(int tea, int candy){
        switch (tea){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 0;
                //System.out.println(0);

        }
        switch (candy){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 0;
                //System.out.println(0);

        }
        int devide = Math.max(tea/candy, candy/tea);
        switch (devide){
            case 0:
            case 1:
                return 1;
                //System.out.println(1);

            default:
                return 2;
                //System.out.println(2);
                //break;
        }
    }
   //endregion

}

