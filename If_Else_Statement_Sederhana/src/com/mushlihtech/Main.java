package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ini adalah operasi If Else Statement sederhana
        int panjang, lebar, luas;

        Scanner input = new Scanner(System.in);

        panjang = 40;
        lebar = 15;
        System.out.print("jika ada persegi panjang memiliki panjang 40 cm dan lebar 15 cm maka luasnya adalah = ");
        luas = input.nextInt();


        //If else Statement
        if (luas == (panjang *lebar) ){

            System.out.println("jawaban anda benar");

        }else {

            System.out.println("jawaban anda salah, jawabanya adalah = " + (panjang * lebar) + " cm");

        }

    }
}
