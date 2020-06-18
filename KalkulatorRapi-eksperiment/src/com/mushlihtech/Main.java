package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int angka1, angka2, hasil;
        float casting,angkaF ;

        Scanner input = new Scanner(System.in);

        String operator;

        System.out.print("masukan Biangan anda :");
        angka1 = input.nextInt();
        operator = input.next();
        angka2 = input.nextInt();
            angkaF = angka1;
        switch (operator) {
            case "/" :
                hasil = (float)
                hasil = angkaF / angka2;

                System.out.println(hasil);
                break;
            case "*" :
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case "%" :
                hasil = angka1 % angka2;
                System.out.println(hasil);
                break;
            case "-" :
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case "+" :
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            default:
                System.out.println("operator salah");
        }

    }
}
