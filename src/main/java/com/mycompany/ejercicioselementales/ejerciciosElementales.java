package com.mycompany.ejercicioselementales;

public class ejerciciosElementales {
    public static void main(String[] args) {
        
        //printear nums pares del 1 al 10
        /*
        for (int n = 0; n < 11; n = n + 2) {
            System.out.println(n);
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        int m = 0;
        while (m < 11){
            System.out.println(m);
            m = m + 2;
        }
        */
        
        for(int n = 0; n <= 10; n++){
        if (n % 2 == 0){
            System.out.println(n);
        }}// Pares
        
        System.out.println(" ");
        
        for(int n = 0; n <= 10; n++){
        if (n % 2 != 0){
            System.out.println(n);
        }}// Impares
        
        
        
        
    }//main
}//ejerciciosElementales
