package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pilihan, pilihankotak, pilihansegitiga, pilihanlingkaran;

        //Deklarasi kotak
        int panjang, lebar, tinggi, luas, volume, keliling;

        //deklarasi segitiga
        float alas, tinggisegitiga, luassegitiga, kelilingsegitiga, sisi, setengah ;
        setengah = 0.5f;

        //Deklarasi lingkaran
        float pi, jarijari, luaslingkaran, kelilinglingkaran;
        pi = 3.14f;
        Scanner input = new Scanner(System.in);

        System.out.println("ini adalah sebuah program untuk menghitung luas, keliling, dan volume sebuah bangun ruang");
        System.out.println("masukan operator anda dengan : \n1 = kotak\n2 = segitiga\n3 = lingkaran");
        System.out.print("\nmasukan operator anda : ");

        pilihan = input.nextInt();

        switch (pilihan){

            case 1 :

                System.out.println("\nini adalah aplikasi penghitung untuk kotak" +
                                    "\nmasukan operator anda dengan :\n" +
                                    "1 = volume\n" +
                                    "2 = luas \n" +
                                    "3 = keliling\n");
                System.out.print("masukan operator anda : ");
                pilihankotak = input.nextInt();
                if (pilihankotak == 1) {

                    System.out.print("\npanjang = ");
                    panjang = input.nextInt();
                    System.out.print("lebar = ");
                    lebar = input.nextInt();
                    System.out.print("tinggi = ");
                    tinggi = input.nextInt();
                    volume = panjang * lebar *tinggi;
                    System.out.println("\nVolumenya adalah = " + volume);

                }else if (pilihankotak == 2){

                    System.out.print("\npanjang = ");
                    panjang = input.nextInt();
                    System.out.print("lebar = ");
                    lebar = input.nextInt();
                    luas = panjang * lebar;
                    System.out.println("\nluasnya adalah = " + luas);

                }else if (pilihankotak == 3){

                    System.out.print("\npanjang = ");
                    panjang = input.nextInt();
                    System.out.print("lebar = ");
                    lebar = input.nextInt();
                    keliling = (panjang *2) + (lebar * 2);
                    System.out.println("\nkelilingnya adalah = " + keliling);

                }else {

                    System.out.println("\nanda salah memasukan operator");

                }

            break;

            case 2 :

                System.out.println("\nini adalah aplikasi penghitung untuk segitiga" +
                        "\nmasukan operator anda dengan :\n" +
                        "1 = luas\n" +
                        "2 = keliling \n");
                System.out.print("masukan operator anda : ");
                pilihansegitiga = input.nextInt();
                if (pilihansegitiga == 1) {

                    System.out.print("\nalas = ");
                    alas = input.nextFloat();
                    System.out.print("tinggi = ");
                    tinggisegitiga = input.nextFloat();
                    luassegitiga = setengah * (alas * tinggisegitiga);
                    System.out.println("\nluasnya adalah = " + luassegitiga);

                }else if (pilihansegitiga == 2) {

                    System.out.print("\nalas = ");
                    alas = input.nextFloat();
                    System.out.print("sisi = ");
                    sisi = input.nextFloat();
                    kelilingsegitiga = alas + (sisi * 2);
                    System.out.println("\nkelingnya adalah = " + kelilingsegitiga);

                }else {

                    System.out.println("\nanda salah memasukan operator");

                }
            break;

            case 3 :
                System.out.println("\nini adalah aplikasi penghitung untuk lingkaran" +
                        "\nmasukan operator anda dengan :\n" +
                        "1 = luas\n" +
                        "2 = keliling \n");
                System.out.print("masukan operator anda : ");
                pilihanlingkaran = input.nextInt();
                if (pilihanlingkaran == 1) {

                    System.out.print("\njari-jari = ");
                    jarijari = input.nextFloat();
                    luaslingkaran = pi * (jarijari * jarijari);
                    System.out.println("\nluasnya adalah = " + luaslingkaran);

                }else if (pilihanlingkaran == 2){

                    System.out.print("\njari-jari = ");
                    jarijari = input.nextFloat();
                    kelilinglingkaran = pi * (jarijari * 2);
                    System.out.println("\nkelilingnya adalah = " + kelilinglingkaran);

                }else {

                    System.out.println("\nanda salah memasukan operator");

                }
            break;

            default:

                System.out.println("\nanda salah memasukan operator");
            break;

        }

    }
}
