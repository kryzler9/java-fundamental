package com.juaracoding;

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args){

        if(true){
            System.out.println("Statement");
        }

        System.out.println("Next Statement");


        // program ganjil genap (if else)
        int platNomor = 1234;

        if(platNomor % 2 == 0){ // 0 == 0 (false)
            System.out.println("Plat Nomor Genap");
        }
        else{
            System.out.println("Plat Nomor Ganjil");
        }

        // if majemuk
        // size, price
        String size = "L";
        int price = 0;
        if(size == "S"){
            price = 40000;
        }else if(size == "M") {
            price = 50000;
        } else if(size == "L") {
            price = 60000;
        }
        System.out.println("Size: "+size+ "Price: "+price);

        // login username password, String object
        String username = "admin";
        String password = "p4ssw0rd";
        if(username.equals("admin") && password.equals("p4ssw0rd")) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }

        // nested if

        Scanner input = new Scanner(System.in);
        System.out.println("Total Amount");
        int totalAmount = input.nextInt();
        System.out.println("Total Amount:"+totalAmount);
        float discount = 0.0f;
        boolean isMember = false;
        boolean isFirstTime = true;
        boolean hasCoupon = false;

        if(totalAmount > 500000){
            if (isMember) {
                discount = 0.1f; //Disc 10%
            } else if(isFirstTime) {
                discount = 0.05f; //Disc 5%
            } else if(hasCoupon) {
                discount = 0.02f; //Disc 2%
            }

        } else {
            System.out.println("Tidak dapat discount"); //Disc 0%
        }

                System.out.println("Discount: "+discount);
                System.out.println("Total Payment: "+(totalAmount-totalAmount*discount));

        // switch case
        // 1. Tampilkan data produk
        // 2. Input data produk
        System.out.println("Masukkan Menu 1-5: ");
        int menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.println("1. Tampilkan Data Produk");
                break;
            case 2:
                System.out.println("2. Input Data Produk");
                break;
            default:
                System.out.println("Invalid Input Menu");
        }



        // ternary
        int stock = 0;
        String tersedia = (stock > 0) ? "Stok tersedia" : "Stok habis";
        System.out.println(tersedia);

        }
    }

