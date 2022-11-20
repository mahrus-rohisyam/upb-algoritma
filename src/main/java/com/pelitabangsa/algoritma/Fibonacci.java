/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pelitabangsa.algoritma;

/**
 *
 * @author Mahrus
 */
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int summary;
        int limit = 100;
        
        System.out.println(first);
        System.out.println(second);
        
        summary = first + second;
        
        while (summary <= limit) {
            System.out.println(summary);
            
            first = second;
            second = summary;
            summary = first + second;
        }
    }
}
