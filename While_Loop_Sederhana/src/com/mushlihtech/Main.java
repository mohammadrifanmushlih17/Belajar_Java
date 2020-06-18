package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //deklarasi variable
        int bilangan, bilangan2, batas, pemberhenti, hasil, tanda;
        boolean operator = true;

        //deklarasi obyek Scanner dan nilai penanda
        Scanner input = new Scanner(System.in);
        tanda = 0;

        //deklarasi input
        System.out.println("ini adalah sebuah program untuk menghitung nilai geometri suatu bilangan");
        System.out.print("masukan bilangan utama = ");
        bilangan = input.nextInt();
        System.out.print("masukan bilangan penambah = ");
        bilangan2 = input.nextInt();
        System.out.print("masukan nila batas yang di inginkan = ");
        batas = input.nextInt();

        //deklarasi nilai untuk menghentikan program
        pemberhenti = bilangan + (bilangan2 * batas);

        System.out.println("\n==============> " + tanda);
        System.out.println(bilangan);

        //operasi WHILE LOOP
        while (operator){

            //deklarasi untuk nilai yang di looping
            tanda++;
            System.out.println("==============> " + tanda + " (" + bilangan + " + " + bilangan2 + ")");
            hasil = (bilangan += bilangan2);
            System.out.println(hasil);

            //operasi IF untuk menghentikan LOOPING
            if (hasil == pemberhenti){

                operator = false;

            }

        }

    }
}
