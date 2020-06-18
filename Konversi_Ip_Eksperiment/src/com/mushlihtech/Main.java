package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Deklarasi
        int a, b, c, d;
        String a_bin, b_bin, c_bin, d_bin, titik;

        Scanner inputuser = new Scanner(System.in);

        //Process input
        System.out.println("masukan Ip anda : ");
        a = inputuser.nextInt();
        titik = inputuser.next();
        b = inputuser.nextInt();
        titik = inputuser.next();
        c = inputuser.nextInt();
        titik = inputuser.next();
        d = inputuser.nextInt();

        //process program
        a_bin = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        b_bin = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        c_bin = String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
        d_bin = String.format("%8s",Integer.toBinaryString(d)).replace(" ","0");

        //Process Output
        System.out.printf("\n%s.%s.%s.%s\n",a, b, c, d);
        System.out.println("=============================Ip To Binary");
        System.out.printf("%s.%s.%s.%s",a_bin, b_bin, c_bin, d_bin);

    }
}
