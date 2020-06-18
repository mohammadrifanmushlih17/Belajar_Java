package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Dekalarasi
        System.out.println("@Copyright By MushlihTech Foundation\n" +
                            "Ini adalah aplikasi untuk mengkonversi bilangan IP ke bilangan Binary.");
        int a, b, c, d;
        String a_bits, b_bits, c_bits, d_bits;

        Scanner input = new Scanner(System.in);

        //processing input
        System.out.println("Masukan IP anda : ");
        System.out.println("masukan angka pertama :");
        a = input.nextInt();
        System.out.println("masukan angka kedua : ");
        b = input.nextInt();
        System.out.println("masukan angka ketiga : ");
        c = input.nextInt();
        System.out.println("masukan angka keempat : ");
        d = input.nextInt();

        //Processing Program
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(" ", "0");

        //process output
        System.out.printf("\n%s.%s.%s.%s\n",a, b, c, d);
        System.out.println("========================Ip to Binary");
        System.out.printf("%s.%s.%s.%s",a_bits ,b_bits ,c_bits ,d_bits);

    }
}
