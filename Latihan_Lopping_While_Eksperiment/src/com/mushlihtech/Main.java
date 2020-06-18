package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //deklarasi Variable
        int bilanganAwal, bilanganAkhir, hasil;

        Scanner input = new Scanner(System.in);

        bilanganAwal = input.nextInt();
        bilanganAkhir = input.nextInt();

        hasil = 0;


        while (hasil >= bilanganAkhir){

            hasil = hasil + bilanganAwal;
            System.out.println(hasil);
            bilanganAwal++;

        }

    }
}
