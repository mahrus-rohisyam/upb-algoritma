/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pelitabangsa.algoritma;
import java.util.Scanner;

/**
 *
 * @author Mahrus
 */
public class PenjumlahanMatrix {
    public static void main(String[] args) {
        int i, j, baris, kolom;
        String garis = "______________________________________";
        Scanner input = new Scanner(System.in);
        System.out.println(garis + "\n");
        System.out.println("       PROGRAM Penjumlahan Matrix");
        System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
        System.out.println(garis + "\n");
        
        System.out.println("Masukkan jumlah baris");
        baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom");
        kolom = input.nextInt();
        
        // Deklarasi variable matriks
        int[][] matriksOne = new int[baris][kolom];
        int[][] matriksTwo = new int[baris][kolom];
        int[][] totalMatriks = new int[baris][kolom];
        
        System.out.println("Masukkan Matriks pertama\n");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++ ){
                // System.out.println("Masukkan input baris " + (i + 1) + " dan kolom " + (j + 1) );
                matriksOne[i][j] = input.nextInt();
            }
        }
        // Input selesai
        
        System.out.println(garis + "\n");
        
        System.out.println("Matriks pertama: ");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++ ){
                System.out.print(matriksOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(garis + "\n");
        
        System.out.println("Masukkan Matriks kedua\n");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++ ){
                // System.out.println("Masukkan input baris " + (i + 1) + " dan kolom " + (j + 1) );
                matriksTwo[i][j] = input.nextInt();
            }
        }
        // Input selesai
        System.out.println("Matriks kedua: ");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++ ){
                System.out.print(matriksTwo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(garis + "\n");
        
        // Operasi penjumlahan        
        System.out.println("Penjumlahan 2 matriks, output: ");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++ ){
                totalMatriks[i][j] = matriksOne[i][j] + matriksTwo[i][j];
            }
            for(j = 0; j < kolom; j++ ){
                System.out.print(totalMatriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
