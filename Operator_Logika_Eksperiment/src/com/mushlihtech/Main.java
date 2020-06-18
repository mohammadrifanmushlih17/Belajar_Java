package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*operasi logika
        1. or / atau dengan tanda (||)
        2. and / dan dengan tanda (&&)
        3. xor / exclusive or dengan tanda (^)
        4. negasi ----> flipping / kebalikan dengan tanda (!)
         */
        System.out.println("@copyright by MushlihTech Foundation" +
                            "\nini adalah aplikasi operator logika berbasis tipe data boolean" +
                            "\nmasukan nilai boolean dengan nilai TRUE atau FALSE" +
                            "\noperator yang digunakan :" +
                            "\n|| = operator OR" +
                            "\n&& = operator AND" +
                            "\n^  = operator XOR (Exclusive OR)" +
                            "\n!  = operator NOT / FLIPPING (Negasi)\n");

        //deklarasi variabel
        boolean a, b, c;

        String operator;

        Scanner input = new Scanner(System.in);

        //proses input
        System.out.println("masukan variabel pertama :");
        a = input.nextBoolean();
        System.out.println("masukan operator :");
        operator = input.next();
        System.out.println("masukan variabel kedua :");
        b = input.nextBoolean();

        //proses switch case
        switch (operator){
            case "||" :
                c = (a || b);
                System.out.printf("\n%s dioperatorkan || dengan %s ====> %s \n",a ,b ,c);
                break;
            case "&&" :
                c = (a && b);
                System.out.printf("\n%s dioperatorkan && dengan %s ====> %s \n",a ,b ,c);
                break;
            case "^" :
                c = (a ^ b);
                System.out.printf("\n%s dioperatorkan ^ dengan %s ====> %s \n",a ,b ,c);
                break;
            case "!" :
                System.out.printf("\n%s dioperatorkan ! adalah  ====> %s \n",a ,(!a) );
                System.out.printf("%s dioperatorkan ! adalah  ====> %s \n",b ,(!b) );
                break;
            default:
                System.out.println("operator yang anda masukan salah");
        }


    }
}
