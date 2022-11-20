package com.pelitabangsa.algoritma;
import java.util.Scanner;

public class Kerucut {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
      try {
        float phi = 3.14f;
        float r, t, s;
        float luas, volume;

        System.out.println("\t Menghitung luas permukaan dan volume kerucut \n\n");

        System.out.println("Masukkan jari - jari  :");
        r = userInput.nextFloat();

        System.out.println("Masukkan Tinggi  :");
        t = userInput.nextFloat();

        System.out.println("Masukkan Panjang Garis  :");
        s = userInput.nextFloat();

        luas = phi * r * (r + s);
        System.out.println("Luas permukaannyan   :" + luas + "cm");

        volume = 1/(float)3 * phi * r * r * t;
        System.out.println("Volume   : " + volume + "cm");
        userInput.close();
      } catch (Exception e) {
          System.out.println("There is an Error: " + e);
      }
  }
}
