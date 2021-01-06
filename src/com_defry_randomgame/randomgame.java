package com_defry_randomgame;

import java.util.Random;
import java.util.Scanner;

public class randomgame {
    public static void main(String[] args) {
        System.out.println("Selamat datang di game tebak angka!");

        System.out.print("Mohon masukkan nama Anda: ");

        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();

        System.out.println("Halo " + nama + " selamat datang..");
        System.out.println("Jawab 1 atau 2");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Apakah Anda siap untuk bermain? ");


        int jawab1 = scan.nextInt();

        while (jawab1 != 1){
            System.out.println("Jawab 1 atau 2");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Apakah Anda siap untuk bermain? ");

            jawab1 = scan.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.print("Coba tebak angka yang saya pikirkan: ");
        int angka = scan.nextInt();

        int cobaJawab = 0;
        boolean menang = false;
        boolean harusSelesai = false;

        while(!harusSelesai){
            cobaJawab++;

            if(cobaJawab < 5){
                if(angka == x){
                    menang = true;
                    harusSelesai = true;
                }else if(angka > x){
                    System.out.println("coba tebak angka yang lebih rendah");
                    angka = scan.nextInt();
                }else{
                    System.out.println("coba tebak angka yang lebih tinggi");
                    angka = scan.nextInt();
                }
            }else {
                harusSelesai = true;
            }
        }

        if(menang){
            System.out.println("Selamat! Anda berhasil menebak angka yang benar pada tebakan ke: " + cobaJawab);
        }else{
            System.out.println("Game over!");
            System.out.println("Angka yang benar adalah: " + x);
        }



    }
}
