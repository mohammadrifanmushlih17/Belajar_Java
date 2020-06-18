package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ini adalah eksperiment If Else
        int panjang, lebar, tinggi, luas, volume, konfirmasi, konfirmasi2;

        Scanner input = new Scanner(System.in);

        panjang = 19;
        lebar = 15;
        tinggi = 20;

        System.out.println("ini adalah program Survey matematika, jika anda ingin berpartisipasi jawab dengan angaka 1 dan 0 jika tidak");
        System.out.print("Konfirmasi = ");
        konfirmasi = input.nextInt();

        //If Else Statement
        if (konfirmasi == 0){ //Action 1 /Ekspresi 1

            System.out.println("anda keluar dari program"); //Statement Default 1

        }else if (konfirmasi == 1) {

            System.out.print("jika sebuah balok mempunyai panjang 19 cm, lebar 15 cm dan tinggi 20 cm, maka volume dari balok tersebut adalah = ");
            volume = input.nextInt();
            if (volume == (panjang * lebar * tinggi)){ //Action 2 /Ekspresi 2

                System.out.println("jawaban anda benar"); //Statement Aksi 1

            }else {

                System.out.println("jawaban anda salah, jangan berkecil hati kami memberi kesempatan 1 kali lagi");
                System.out.print("jika sebuah balok mempunyai panjang 19 cm, lebar 15 cm dan tinggi 20 cm, maka luas bidang dasar dari balok tersebut adalah = ");
                luas = input.nextInt();

                if (luas == (panjang * lebar)){ //Action 3 /Ekspresi 3

                    System.out.println("jawaban anda benar"); //Statement Aksi 2

                }else {

                    System.out.println("jawaban anda salah, apakah anda ingin menegetahu jabanya?\njawab dengan angka 1 jika ya dan angka 0 jika tidak"); //Statement Default 2
                    System.out.print("konfirmasi = ");
                    konfirmasi2 = input.nextInt();
                    if(konfirmasi2 == 1){

                        System.out.println("jawabanya adalah sebagai berikut, Luasnya adalah = " + (panjang * lebar) + " cm dan Volumenya adalah = " + (panjang * lebar * tinggi) + " cm");

                    }else if (konfirmasi2 == 0){

                        System.out.println("Terimakasih atas partisipasinya");

                    }else{

                        System.out.println("anda hanya bisa memilih angka 1 atau 0");

                    }

                }

            }

        }else {

            System.out.println("anda salah memasukan nilai konfirmasi");
        }

    }
}
