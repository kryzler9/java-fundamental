package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args){

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Next Statement");

        //1 3 5 7
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

        // ***
        // ***
        // ***

        int sisi = 10; //10x10
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //Segitiga Siku
        for (int i = 0; i < sisi; i++){
            for (int j = sisi; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //while
        int x = 0;
        while (x < 5){
            System.out.println(x);
            x++;
        }

        //do while
        int y = 0;
        do {
            System.out.println("y =" +y);
            y++;
        }while (y<0);

        //terus menerus looping, ketika tekan 0 keluar dari aplikasi
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Running");
            int num = input.nextInt();
            if(num == 0) break;
        }




    }
}
