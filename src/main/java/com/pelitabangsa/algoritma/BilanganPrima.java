/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pelitabangsa.algoritma;

/**
 *
 * @author Mahrus
 */
public class BilanganPrima {
    public static void main(String[] args) {
        for(int number = 1; number < 1000; number++){
            boolean isPrime = false;
            for (int i = 2; i <= number; i++){
                if (number % i == 0 && i != number){
                    isPrime = true;
                }
            }
            if (isPrime == false) {
                System.out.println("Bilangan primanya nich: " + number);
            }
        }
    }
}
