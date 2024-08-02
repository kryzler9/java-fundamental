package com.juaracoding;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello Juara!");
        int number = 10;
        if(true){
            System.out.println(number);
            System.out.println("True");
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(number);
            System.out.println(i);
        }

        //String Object
        String country = "Indonesia";
        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());
        System.out.println(country.length());

        //------
        String errorMessage = "Invalid credentials";
        System.out.println(errorMessage.contains("Inval"));

        //55.000, 35.000
        String price1 = "55.000";
        String price2 = "35.000";
        String replacePrice1 = price1.replace( ".", "");
        String replacePrice2 = price2.replace(".","");
        int numPrice1 = Integer.parseInt(replacePrice1);
        int numPrice2 = Integer.parseInt(replacePrice2);
        System.out.println(numPrice1+numPrice2);
        System.out.println(price1+price2); //concat
        System.out.println(price1.substring(0,2));

    }
}