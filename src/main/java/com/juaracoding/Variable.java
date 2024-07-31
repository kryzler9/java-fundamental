package com.juaracoding;

public class Variable {

        public static void main(String[] args){


                char gender = 'L';
                char predikat = 'A';

                System.out.println("\"JuaraCoding\nIndonesia");

                boolean isResult = true;
                boolean isLogin = false;

                String productName = "Headset";
                System.out.println("Product Name : "+productName);

                //------------------------------------------------------------------------

                //buat output menampilkan profile user

                System.out.println("\" User Profile\nE-Commerce");

                String userName = "Daffa";
                String email = "daffa123@gmail.com";
                String level = "Silver";

                System.out.println("Username : "+userName);
                System.out.println("Email : "+email);
                System.out.println("Level Akun: "+level);

                boolean isActive = true;
                System.out.println("Active :"+isActive);

                float saldo = 73500.30f;
                System.out.println("Saldo :"+saldo);

                short pembelian = 200;
                System.out.println("Pembelian Berhasil : "+pembelian);

                //------------------------------------------------------------------------

                // Implicit / Automatic casting
                short data1 = 456;
                double dataDouble = data1;
                System.out.println(data1);
                System.out.println(dataDouble);

                char data2 = 'Z';
                long dataLong = data2;
                System.out.println(dataLong);

                // Explicit Casting
                char data3 = '+';
                byte dataByte = (byte) data3;
                System.out.println(dataByte);

                int stok = 9999;
                short dataShort = (short) stok;
                System.out.println(dataShort);

                // Passing by Value
                String address = "Jakarta";
                String duplicatAddress =  address;
                duplicatAddress = "Bandung";
                System.out.println(duplicatAddress);

                //Phi = 3.14








        }
}
