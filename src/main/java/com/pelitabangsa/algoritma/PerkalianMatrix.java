package com.pelitabangsa.algoritma;

import java.util.Scanner;

public class PerkalianMatrix {
  public static void main(String[] args) {
    int i, j, k, baris, kolom, sum = 0;
    String garis = "______________________________________";
    Scanner input = new Scanner(System.in);
    System.out.println(garis + "\n");
    System.out.println("       PROGRAM Perkalian Matrix");
    System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
    System.out.println(garis + "\n");

    System.out.println("Masukkan jumlah baris");
    baris = input.nextInt();
    System.out.println("Masukkan jumlah kolom");
    kolom = input.nextInt();

    int[][] matriksOne = new int[baris][kolom];
    int[][] matriksTwo = new int[baris][kolom];
    int[][] totalMatriks = new int[baris][kolom];

    System.out.println("Masukkan Matriks pertama\n");
    for (i = 0; i < baris; i++) {
      for (j = 0; j < kolom; j++) {
        // System.out.println("Masukkan input baris " + (i + 1) + " dan kolom " + (j +
        // 1));
        matriksOne[i][j] = input.nextInt();
      }
    }
    // Input selesai

    System.out.println(garis + "\n");

    System.out.println("Matriks pertama: ");
    for (i = 0; i < baris; i++) {
      for (j = 0; j < kolom; j++) {
        System.out.print(matriksOne[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(garis + "\n");

    System.out.println("Masukkan Matriks kedua\n");
    for (i = 0; i < baris; i++) {
      for (j = 0; j < kolom; j++) {
        // System.out.println("Masukkan input baris " + (i + 1) + " dan kolom " + (j +
        // 1));
        matriksTwo[i][j] = input.nextInt();
      }
    }
    // Input selesai
    System.out.println("Matriks kedua: ");
    for (i = 0; i < baris; i++) {
      for (j = 0; j < kolom; j++) {
        System.out.print(matriksTwo[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(garis + "\n");

    // Operasi perkalian
    System.out.println("Perkalian 2 matriks, output: ");
    for (i = 0; i < baris; i++)

      for (j = 0; j < kolom; j++) {
        sum = 0;
        for (k = 0; k < baris; k++) {
          sum += matriksOne[i][k] * matriksTwo[k][j];

        }
        totalMatriks[i][j] = sum;
      }
    for (i = 0; i < baris; i++) {
      for (j = 0; j < kolom; j++)
        System.out.print(totalMatriks[i][j] + " ");

      System.out.println();
    }
    System.out.println();
  }
}
