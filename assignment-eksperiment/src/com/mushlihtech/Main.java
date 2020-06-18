package com.mushlihtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //code source by Mohammad rif'an Mushlih

        int f;
        //int e, f;
        boolean e;

        String operator;

        Scanner input = new Scanner(System.in);

        f = 0;

        System.out.println("    +-------selamat datang-------+");
        System.out.println("ini adalah program eksperimen dari pengembangan assignment");

        //deklarasi soal
        System.out.println("\nskor pertama kamu adalah = " +f );
        System.out.println("jika kamu bisa menjawab soal berikut, maka skormu\n" +
                            "akan di tambah dan apabila salah akan di kurangi ");
        System.out.println("soal : \n" +
                            "1. nabi muhammad lahir dimana ? \n" +
                            "   a. makkah\n" + //true
                            "   b. madinah\n" +
                            "   c. tarim\n" +
                            "   d. syams\n");

        //deklarasi input 1 (a)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 2
        System.out.println("\n2. nabi muhammad wafat dan dimakamkan di kota ? \n" +
                "   a. makkah\n" +
                "   b. madinah\n" + //true
                "   c. jakarta\n" +
                "   d. baghdad\n");

        //deklarasi input 2 (b)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = true;
                f += 10;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 3
        System.out.println("\n3. siapakah nama kakek dari nabi muhammad ? \n" +
                "   a. abdul mutholib\n" + //true
                "   b. abu tholib Ra.\n" +
                "   c. hamzah Ra.\n" +
                "   d. abbas Ra.\n");

        //deklarasi input 3 (a)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 4
        System.out.println("\n4. nabi muhammad wafat pada umur ? \n" +
                "   a. 59 tahun\n" +
                "   b. 45 tahun\n" +
                "   c. 62 tahun\n" +
                "   d. 63 tahun\n"); //true

        //deklarasi input 4 (d)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 5
        System.out.println("\n5. berapakah jumlah putra - putri nabi muhammad ? \n" +
                "   a. 4\n" +
                "   b. 7\n" + //true
                "   c. 5\n" +
                "   d. 9\n");

        //deklarasi input 5 (b)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = true;
                f += 10;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 6
        System.out.println("\n6. sebutkan salah satu dari khulafa'ur rasyidin ? \n" +
                "   a. zaid bin tsabbit Ra.\n" +
                "   b. muawiyah bin abi sufyan Ra.\n" +
                "   c. sayyidina abu bakar as-shidiq Ra.\n" + //true
                "   d. abdurrahman bin auf Ra.\n");

        //deklarasi input 6 (c)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 7
        System.out.println("\n7. sebutkan salah satu dari 4 imam madzhab ? \n" +
                "   a. syaikh jalaluddin ar-rumi\n" +
                "   b. imam syafi'i\n" + //true
                "   c. imam ghozali\n" +
                "   d. imam an-nawawi\n");

        //deklarasi input 7 (b)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = true;
                f += 10;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal jackpot
        System.out.println("\nuich ada soal kejutan nich, hayoo siapa yang bisa jawab" +
                            "\nskornya akan di kalikan 2, apabila salah akan di bagi 2");
        System.out.println("\nsoal bonus : siapakah nama asli dari pengarang kitab taqrib ? \n" +
                "   a. syaikh umar syato'\n" +
                "   b. syaikh muhammad bin muhammad bin muhammad al-ghozali\n" +
                "   c. syaikh muhammad as-shonhaji\n" +
                "   d. syaikh ahmad bin husen bin ahmad al-asfihany\n"); //true

        //deklarasi input jackpot (d)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = true;
                f *= 2;
                System.out.println("jawaban anda benar");
                System.out.println("skor anda dikalikan 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f /= 2;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  dibagi menjadi 2");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = true;
                f *= 2;
                System.out.println("jawaban anda benar");
                System.out.println("skor anda dikalikan 2");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 8
        System.out.println("\n8. siapakah penyebar islam di tanah jawa ? \n" +
                "   a. walisongo\n" + //true
                "   b. sayyidina ali Ra.\n" +
                "   c. muawiyah bin abi sufyan Ra.\n" +
                "   d. abdurrahman bin auf Ra.\n");

        //deklarasi input 8 (a)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 9
        System.out.println("\n9. siapakah nama asli dari sunan ampel ? \n" +
                "   a. raden paku\n" +
                "   b. raden fattah\n" +
                "   c. raden rahmatullah\n" + //true
                "   d. raden ibrahim asmoroqondi\n");

        //deklarasi input 9 (c)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }

        //deklarasi soal ke 10
        System.out.println("\n10. NU adalah organisasi keaagamaaan yang berfaham ? \n" +
                "   a. ahlussunnah wal jamaah\n" + //true
                "   b. qodariyah\n" +
                "   c. muktazilah\n" +
                "   d. jabbariyah\n");

        //deklarasi input 10 (a)
        System.out.println("masukan jawaban anda :");
        operator = input.next();
        switch (operator){
            case "a":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "b" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "c" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "d" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "A":
                e = true;
                f += 10;
                System.out.println("jawaban anda benar");
                System.out.println("anda mendapatkan skor 10");
                System.out.println("skor anda adalah = " +f);
                break;
            case "B" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "C" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            case "D" :
                e = false;
                f -= 5;
                System.out.println("jawaban anda salah");
                System.out.println("skor anda  berkurang 5");
                System.out.println("skor anda adalah = " +f);
                break;
            default:
                System.out.println("jawaban hanya menggunakan a, b, c, d");
        }
        /*skor taratas (betul semua) adalah = 170
          skor betul semua (kecuali jackpot) adalah = 65*/

        System.out.println("\nskor terakhir kamu adalah = " +f);

        //deklarasi operator if else
        if (f==170){
            System.out.println("selamat!!! anda telah menyelesaikan semua soal dengan tepat");

        }else {
            System.out.println("jangan berkecil hati!, masih ada kesempatan lagi");
        }

        System.out.println(" \n              source code by MushlihTech Foundation       ");
        System.out.println("      +================================================+");
        System.out.println("               @copyright by MushlihTech Foundation        ");

        /*deklarasi assignment rad dadi
        if (e = true){
            f += 10;
            System.out.println("anda mendapatkan skor 10");
        }else{
            f -= 5;
            System.out.println("skor anda  berkurang 5");
        }
        System.out.println("skor anda adalah = " +f);

        //deklarasi jawaban*/

        //finished at sabtu, 01-02 june 2020 at night


    }
}
