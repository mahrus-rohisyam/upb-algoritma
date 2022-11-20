package com.pelitabangsa.algoritma;

import java.util.Scanner;

public class MatrixMultiplication {
  public static void main(String args[]) {
    int row, col, i, j, k;
    Scanner in = new Scanner(System.in);
    String garis = "______________________________________";
    System.out.println(garis + "\n");
    System.out.println("       PROGRAM Perkalian Matrix");
    System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
    System.out.println(garis + "\n");

    System.out.println("Enter the number columns of matrix 1");
    col = in.nextInt();
    System.out.println("Enter the number of rows of matrix2");
    row = in.nextInt();

    System.out.println(garis + "\n");
    
    if (col == row) {

      int mat1[][] = new int[row][col];
      int mat2[][] = new int[row][col];
      int res[][] = new int[row][col];

      System.out.println("Enter the elements of matrix1");

      for (i = 0; i < row; i++) {

        for (j = 0; j < col; j++)
          mat1[i][j] = in.nextInt();

      }
      System.out.println("Enter the elements of matrix2");

      for (i = 0; i < row; i++) {

        for (j = 0; j < col; j++)
          mat2[i][j] = in.nextInt();

      }

      System.out.println("\n\noutput matrix:-");
      for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
          for (k = 0; k < row; k++) {
            res[i][j] += mat1[i][k] * mat2[k][j];
          }
        }
      }
      for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++)
          System.out.print(res[i][j] + " ");

        System.out.println();
      }
    } else {
      System.out.print("multipication does not exist ");
    }
    in.close();
  }
}
