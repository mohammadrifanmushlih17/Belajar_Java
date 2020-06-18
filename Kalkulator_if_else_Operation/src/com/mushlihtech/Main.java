package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Deklarasi Variable
        int bilanganAwal, bilanganAkhir, hasil;
        float hasilFloat;
        char operator;
        Scanner input;

        System.out.println("ini adalah program kalkulator sederhana menggunakan If else Statement\n" +
                            "masukan operasi matematika anda dengan format :\n" +
                            "(bilangan pertama) operator (bilangan kedua)\n" +
                            "masukan operator dengan :\n" +
                            "+ = penjumlahan\n" +
                            "- = pengurangan\n" +
                            "* = perkalian\n" +
                            "/ = pembagian\n" +
                            "% = modulus");
        System.out.println("contoh : 12 + 3");
        System.out.println("=========kalkulator sederhana=========");

        //Proses input
        input = new Scanner(System.in);
        System.out.print("masukan operasi matematika anda : ");
        bilanganAwal = input.nextInt();
        operator = input.next().charAt(0);
        bilanganAkhir = input.nextInt();

        //proses If else Statement untuk program kalkulator
        if (operator == '+'){

            hasil = bilanganAwal + bilanganAkhir;
            System.out.printf("\nhasil dari %d %c %d = %d",bilanganAwal ,operator ,bilanganAkhir ,hasil);

        }else if (operator == '-'){

            hasil = bilanganAwal - bilanganAkhir;
            System.out.printf("\nhasil dari %d %s %d = %d",bilanganAwal ,operator ,bilanganAkhir ,hasil);

        }else if (operator == '*'){

            hasil = bilanganAwal * bilanganAkhir;
            System.out.printf("\nhasil dari %d %s %d = %d",bilanganAwal ,operator ,bilanganAkhir ,hasil);

        }else if (operator == '/'){

//            bilanganFloat = (float) bilanganAwal;

            hasilFloat = (float) bilanganAwal / bilanganAkhir;
            System.out.printf("\nhasil dari %d %s %d = %f ",bilanganAwal ,operator ,bilanganAkhir ,hasilFloat);

        }else if (operator == '%'){

            hasil = bilanganAwal % bilanganAkhir;
            System.out.printf("\nhasil dari %d %s %d = %d",bilanganAwal ,operator ,bilanganAkhir ,hasil);

        }else {

            System.out.println("\nanda salah memasukan operator");

        }

    }
}
