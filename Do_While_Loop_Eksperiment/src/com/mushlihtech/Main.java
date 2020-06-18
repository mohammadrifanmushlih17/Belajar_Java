package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //deklarasi variable
        int bilangan1, bilangan2, tanda, hasil, pemberhenti, batas;
        boolean operator, operator2;
        String yesno;

        //deklarasi obyek Scanner dan variable Static awal
        Scanner input = new Scanner(System.in);
        operator2 = true;
        tanda = 0;

        //awal program
        System.out.println("ini adalah program untuk menghitung nilai geometri suatu bilangan");

        //DO WHILE program
        do {

            //deklarasi input variable agreement
            System.out.print("Apakah anda ingin memulai program (y/n) ====> ");
            yesno = input.next();

            //opersi SWITCH
            switch (yesno){

                case "y" :
                    operator = false;
                    break;
                case "n" :
                    operator = true;
                    System.out.println("anda dapat keluar program dengan CTRL + C");
                    break;
                default:
                    operator = true;
                    System.out.println("anda hanya dapat menggunakan Y/N");
            }

        }while (operator);

        //operasi input
        System.out.print("masukan angka utama = ");
        bilangan1 = input.nextInt();
        System.out.print("masukan bilangan penambah = ");
        bilangan2 = input.nextInt();
        System.out.print("batas yang di inginkan adalah yang ke-");
        batas = input.nextInt();

        //deklarasi variable static untuk menghentikan looping
        pemberhenti = bilangan1 + (bilangan2 * batas);

        System.out.println("\n===========> " + tanda);
        System.out.println(bilangan1);

        //WHILE loop operator
        while (operator2){

            //operasi geometri
            tanda++;
            System.out.println("===========> " + tanda + " (" + bilangan1 + " + " + bilangan2 + ")");
            hasil = (bilangan1 += bilangan2);
            System.out.println(hasil);

            //IF pemberhenti program
            if (hasil == pemberhenti){

                operator2 = false;

            }

        }

    }
}
