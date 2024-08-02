package com.juaracoding;

import java.util.Scanner;

public class ArrayJava {

        public static void main(String[] args){

            // cara 1
            int[] nilai = {86,87,88,89,90};

            System.out.println(nilai[2]);
            System.out.println(nilai.length);

            for (int i = 0; i < 5; i++){
                System.out.println(nilai[i]);
            }

            // cara 2
            int[] grades = new int[5];
            grades[0] = 86;
            grades[1] = 87;
            grades[2] = 88;
            grades[3] = 89;
            grades[4] = 90;
            grades[2] = 91;

            for (int i = 0; i < grades.length; i++) {
                System.out.println(grades[i]);
            }

            //for each
            for(double grade : grades){
                System.out.println(grade);
            }

            //string
            String[] cars = {"Volvo","BMW","Ford","Mazda","Toyota"};
            for(String car : cars){
                System.out.println(car.toUpperCase());
            }

            //Array Multidimensi
            int[][] numbers = {{1,2,3,4},{5,6,7}};
            int rowIndex = 0;
            int columnIndex = 3;
            System.out.println(numbers[1][2]);
            System.out.println(numbers[0][3]);

            System.out.println(numbers[rowIndex][columnIndex]);

            for (int i = 0; i < numbers.length ; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j]);
                }
                System.out.println();
            }

            //input (Scanner) 5 data array prices
            //jumlahkan semua data price
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan jumlah data: ");
            int dataLength = input.nextInt();
            int prices[] = new int[dataLength];
            int total = 0;

            for (int i = 0; i < prices.length; i++) {
                System.out.println("Masukan harga ke-"+(i+1)+":");
                prices[i] = input.nextInt();
                total += prices[i];
            }
            System.out.println("Total: "+total);
            //assignment value
            //totalPrice += price // totalPirce = 0 + 30000

            //search
            //cari salah satu data mobil gunakan array
            //if(search equals cars[i]) break

            boolean isFound = false;
            System.out.println("Cari Mobil: ");
            String search = input.next();
            for (int i = 0; i < cars.length; i++) {
                if(search.equalsIgnoreCase(cars[i])) {
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                System.out.println("Data ditemukan");
            } else {
                System.out.println("Data tidak ditemukan");
            }
            String message = isFound ? "Data ditemukan" : "Data tidak ditemukan";
            System.out.println(message);

            // cari kata terpanjang dari data cars
            // result toyota
            // langkah : length(), 6 < 5 (false)
            String kataTerpanjang = cars[0];
            for (int i = 0; i < cars.length; i++) {
                if(kataTerpanjang.length() < cars[i].length()){
                    kataTerpanjang = cars[i];
                }
            }
            System.out.println(kataTerpanjang);
        }
}
