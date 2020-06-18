package com.mushlihtech;

public class Main {

    public static void main(String[] args) {
        int a,b,c,D;
        boolean er;

        //operasi unary - dan +
        System.out.println("+============ unary - dan + ============+");
        a = 7;
        System.out.printf("unary '+' dari %d adalah = %d \n",a,+a);
        System.out.printf("unary '-' dari %d adalah = %d \n",a, -a);

        //operasi prefix dan postfix dari increment
        System.out.println("+=== unary prefix dan postfix dari increment ===+");
        b = 3;
        c = 8;
        System.out.printf("prefix increment dari %d adalah = %d \n",b,++b);
        System.out.printf("postfix incremen dari %d adalah = %d \n",c, c++);
        System.out.println("dan sebenarnya hasil dari postfix akan \ndi eksekusi setelahnya yaitu = " +c);

        //operasi prefix dan postfix dari decrement
        System.out.println("+=== unary prefix dan postfix dari decrement ===+");
        b = 9;
        c = 2;
        System.out.printf("prefix increment dari %d adalah = %d\n",b,--b);
        System.out.printf("postfix dari %d adalah = %d\n",c,c--);
        System.out.println("dan hasil sebenarnya dari postfix\nakan di eksekusi setelahnya yaitu = "+c);

        //operasi negasi (!) untuk boolean
        System.out.println("+==== negasi (!) untuk tipe data boolean ====+");
        er = true;
        System.out.printf("nilai negasi dari %b adalah = %b\n",er, !er);
        System.out.printf("nilai megasi dari %b adalah = %b\n",!er,er);

        //@copyright by mushlihtech foundation
        System.out.println("\nsource code by mushlihtech foundation");
        System.out.println("@copyright by mushlihtech foundation");
    }
}
