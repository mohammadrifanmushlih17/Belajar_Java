package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*operator komparasi :
        1. operator equal atau persamaan (==)
        2. operator not equal atau pertidaksamaan (!=)
        3. operator less than atau kurang dari (<)
        4. operator greater than atau lebih dari(>)
        5. operator less than equal atau kurang dari sama dengan (<=)
        6. operator greater than equal atau lebih dari sama dengan (>=)
         */
        System.out.println("@copyright by Mushlihtech foundation");

        //proses deklarasi
        int a, b;

        String operator;

        boolean c;

        Scanner input = new Scanner(System.in);

        //proses input
        System.out.println("ini adalah aplikasi operator komparasi" +
                            "\noperator yang digunakan :\n" +
                            "'=='  untuk operasi equal\n" +
                            "'!='  untuk operasi not equal\n" +
                            "'<'   untuk operasi less than\n" +
                            "'>'   untuk operasi greater than\n" +
                            "'<='  untuk operasi less than equal\n" +
                            "'>='  untuk operasi greater than equal\n");

        System.out.println("masukan angka pertama :");
        a = input.nextInt();
        System.out.println("masukan operator komparasi :");
        operator = input. next();
        System.out.println("masukan angka kedua :");
        b = input.nextInt();

        //proses progaram (switch case)
        switch (operator){
            case "==" :
                c = (a == b);
                System.out.printf("\n%d apakah sama dengan %d ? ===> %s \n",a,b,c);
                break;
            case "!=" :
                c = (a != b);
                System.out.printf("\n%d apakah tidak sama dengan %d ? ===> %s \n",a,b,c);
                break;
            case "<" :
                c = (a < b);
                System.out.printf("\n%d apakah kurang dari %d ===> %s ? \n",a,b,c);
                break;
            case ">" :
                c = (a > b);
                System.out.printf("\n%d apakah lebih dari %d ? ===> %s \n",a,b,c);
                break;
            case "<=" :
                c = (a <= b);
                System.out.printf("\n%d apakah kurang dari sama dengan %d ? ===> %s \n",a,b,c);
                break;
            case ">=" :
                c = (a >= b);
                System.out.printf("\n%d apakah lebih dari sama dengan %d ? ===> %s \n",a,b,c);
                break;
            default :
                System.out.println("\noperator yang anda masukan salah");

        }

    }
}
