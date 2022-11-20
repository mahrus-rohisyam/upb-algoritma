package com.pelitabangsa.algoritma;
import java.util.Scanner;

public class SwitchCase {
  int secondPassed = 0;

  public static void main(String[] args) {
    String jawaban;
    Scanner input = new Scanner(System.in);
    String garis = "______________________________________";

    System.out.println(garis + "\n");
    System.out.println("       PROGRAM Cari Pacar");
    System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
    System.out.println(garis + "\n");

    System.out.println("Mau ngga jadi pacarku? [Y/N]");
    jawaban = input.next();
    input.close();

    switch (jawaban.toLowerCase()) {
      case "y":
          System.out.println("Asik, akhirnya saya tidak jomblo.");
          System.out.println("Tapi maaf, aku sudah punya.");
        break;
    case "n":
          System.out.println("Yah, kamu jahat!");
          System.out.println("Tapi gapapa kok, aku sudah punya.");
      default:
          System.out.println("Tanya apa... Jawabannya apa...");
        break;
    }
  }
}
