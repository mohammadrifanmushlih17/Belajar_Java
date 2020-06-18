package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //deklarasi variable
        int bilangan1, bilangan2, tanda, pemberhenti;
        long bilangan1_long, hasil;

        //deklarasi variable obyek Scanner dan variable static awal
        Scanner input = new Scanner(System.in);
        tanda = 0;

        //operasi input user untuk variable //initialisasi variable FOR
        System.out.println("ini adalah program untuk mengetahui kuadrat suatu bilangan");
        System.out.print("masukan bilangan anda = ");
        bilangan1 = input.nextInt();
        System.out.print("masukan batas kuadrat yang di inginkan = ");
        pemberhenti = input.nextInt();

        //operasi Casting dari INTEGER ke LONG
        bilangan1_long = (long) bilangan1;
        bilangan2 = bilangan1;

        System.out.println("\n===========> ^" + tanda + " (" + bilangan1 + " ^ " + tanda + ")");
        System.out.println(tanda);
        System.out.println("===========> ^" + ++tanda + " (" + bilangan1 + " ^ " + tanda + ")");
        System.out.println(bilangan1);

        //FOR lopping operation dengan inisialisasi diatas dan statement di bawah
        for (; !(pemberhenti == tanda) ;){

            //Statement FOR
            tanda++;
            hasil = (bilangan1_long *= bilangan2);
            System.out.println("===========> ^" + tanda + " (" + bilangan1 + " ^ " + tanda + ")");
            System.out.println(hasil);

        }

    }
}
