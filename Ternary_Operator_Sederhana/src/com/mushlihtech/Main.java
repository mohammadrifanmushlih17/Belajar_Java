package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //dekalrasi variable
        int bilangan1, bilangan2, bilanganhasil, operator;

        Scanner input = new Scanner(System.in);

        System.out.println("ini adalah program operator Ternary sedrhana");
        System.out.println("masukan operator anda dengan :\n" +
                "1 : membagi bilangan\n" +
                "2 : memodulus bilangan");
        System.out.println("=========Ternary Operator=========");

        //input user
        System.out.print("masukan operator anda = ");
        operator = input.nextInt();

        //operasi if else
        if (operator < 3){

            //if else untuk menampilkan operator yang digunakan (bukan bagian dari program utama)
            if (operator == 2){

                System.out.println("anda akan memodulus bilangan");

            }else if (operator == 1){

                System.out.println("anda akan membagi bilangan");

            }
            //tanpa else statement
            //akhir if else sekunder

            //if else utama
            if (operator > 0){

                System.out.print("\nmasukan bilangan pertama = ");
                bilangan1 = input.nextInt();
                System.out.print("masukan bilangan kedua = ");
                bilangan2 = input.nextInt();

                //Ternary operator (inti program)
                bilanganhasil = (operator == 1) ? (bilangan1 / bilangan2) : (bilangan1 % bilangan2);
                System.out.print("\nhasilnya adalah = " + bilanganhasil);

            }else {

                System.out.println("\nanda salah memasukan operator");
            }

        }else {
            System.out.println("\nanda salah memasukan operator");
        }


    }
}
