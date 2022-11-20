package com.pelitabangsa.algoritma;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int baris, kolom, i, j;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Jumlah baris: ");
        baris = scan.nextInt();
        
        System.out.println("Jumlah kolom: ");
        kolom = scan.nextInt();
        
        int A[][] = new int[baris][kolom];
        int B[][] = new int[baris][kolom];
        int C[][] = new int[baris][kolom];
        
        System.out.println("Masukkan nilai Array A dan B!");
        
        for(i = 0; i <= kolom; i++){
            for(j = 0; j <= baris; j++){
                System.out.println("Data ke: " + (i + 1) +  "," + (j + 1) );
                A[i][j] = scan.nextInt();
                B[i][j] = scan.nextInt();
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        System.out.println("Array A");
        for(i = 0; i < kolom; i++){
            for(j = 0; j< baris; i++){
                System.out.println(A[i][j] + ",");
            }
            System.out.println();
        }
        
        System.out.println("Array B");
        for(i = 0; i < kolom; i++){
            for(j = 0; j< baris; i++){
                System.out.println(B[i][j] + ",");
            }
            System.out.println();
        }
        
        System.out.println("Array C");
        for(i = 0; i < kolom; i++){
            for(j = 0; j< baris; i++){
                System.out.println(C[i][j] + ",");
            }
            System.out.println();
        }
    }
}
