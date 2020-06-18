package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ini adalah operasi If Else if Statement Sederhana
        int panjang, lebar, tinggi, luas, volume, angkatebakan;

        Scanner input = new Scanner(System.in);

        panjang = 15;
        lebar = 7;
        tinggi = 9;
        System.out.print("pilihlah nilai tebakan anda antara 1 atau 2\nmasukan nilai tebakan anda = ");
        angkatebakan = input.nextInt();

        //If else If Statement
        if (angkatebakan == 1) {

            System.out.print("jika sebuah balok memiliki panjang 15 cm, lebar 7 cm dan tinggi 9 cm, maka luasnya adalah = ");
            luas = input.nextInt();
            if (luas == (panjang * lebar)){

                System.out.println("jawaban anda benar");

            }else {

                System.out.println("jawaban anda salah, yang benar adalah = " + (panjang *lebar));

            }

        } else if(angkatebakan == 2){

            System.out.print("jika sebuah balok memiliki panjang 15 cm, lebar 7 cm dan tinggi 9 cm, maka volumenya adalah = ");
            volume = input.nextInt();
            if (volume == (panjang * lebar * tinggi)){

                System.out.println("jawaban anda benar");

            }else {

                System.out.println("jawaban anda salah, yang betul adalah = " + (panjang * lebar * tinggi));

            }

        }else {

            System.out.println("anda salah menebak, pilihlah angka 1 atau 2");

        }

    }
}
