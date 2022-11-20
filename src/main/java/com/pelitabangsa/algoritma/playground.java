package com.pelitabangsa.algoritma;
import java.util.Scanner;
/**
 *
 * @author Mahrus
 */
public class playground {
    public static void main(String[] args) {
        int i, j, nilai, nim;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome");
        
        System.out.println("Masukkan NIM");
        nim = input.nextInt();
        System.out.println("Masukkan Nilai");
        nilai = input.nextInt();
        
        if(nilai >= 80 && nilai < 100) {
            System.out.println("NIM: " + nim + " Nilai: " + nilai);
        } else if(nilai >= 70 && nilai < 80){
            System.out.println("NIM: " + nim + " Nilai: " + nilai);
        } else if(nilai >= 60 && nilai <70){
            System.out.println("NIM: " + nim + " Nilai: " + nilai);
        } else if (nilai >= 50 && nilai < 60){
            System.out.println("NIM: " + nim + " Nilai: " + nilai);
        } else if (nilai >= 0 && nilai <50){
            System.out.println("NIM: " + nim + " Nilai: " + nilai);
        } else {
            System.out.println("Out of range");
        }
    }
}
