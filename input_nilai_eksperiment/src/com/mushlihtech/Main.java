package com.mushlihtech;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        float bing,bind,ipa,ips, pkn, pai, bjawa, mtk, jumlah;
        float rata1, rata2;

        Scanner input= new Scanner(System.in);

        System.out.println("masukan nilai bahasa inggris :");
        bing = input.nextFloat();

        System.out.println("masukan nilai bahasa indonesia :");
        bind = input.nextFloat();

        System.out.println("masukan nilai ipa :");
        ipa = input.nextFloat();

        System.out.println("masukan nilai ips :");
        ips = input.nextFloat();

        System.out.println("masukan nilai pkn :");
        pkn = input.nextFloat();

        System.out.println("masukan nilai pai :");
        pai = input.nextFloat();

        System.out.println("masukan nilai bahasa jawa :");
        bjawa = input.nextFloat();

        System.out.println("masukan nilai mtk :");
        mtk = input.nextFloat();

        //rata-rata untuk kelulusan siswa

        System.out.println("masukan nilai rata-rata KKM");
        rata1 = input.nextFloat();

        //proces program

        jumlah = bing + bind + ipa + ips + pkn + pai + bjawa + mtk;
        rata2 = jumlah / 8;

        System.out.println("jumlah nilai siswa adalah : " + jumlah);
        System.out.println("nilai rata - rata siswa adalah : " + rata2);
        System.out.println("nilai rata - rata minimal KKM adalah : " + rata1);

        if (rata2 > rata1){
            System.out.println("siswa dinyatakan lulus");

        }else {
            if (rata2 == rata1){
                System.out.println("siswa dinyatakan lulus dan harus mengikuti kelas tambahan");

            }
            System.out.println("siswa dinyatakan tidak lulus dan harus mengikuti remidi");
        }



    }
}
