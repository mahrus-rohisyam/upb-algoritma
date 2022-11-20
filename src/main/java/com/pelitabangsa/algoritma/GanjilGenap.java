package com.pelitabangsa.algoritma;
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int start = 1;
        int limit = 30;
        int bilangan;
        String garis = "______________________________________";
        /*
        *   Menampilkan bilangan ganjil
        */
        
        System.out.println(garis + "\n");
        System.out.println("       PROGRAM GANJIL GENAP");
        System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
        System.out.println(garis + "\n");
        
        System.out.println("Berikut adalah bilangan Ganjil : 1-30:");
        
        for(int i = start; i < limit; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n" + garis);
        
        System.out.println("Berikut adalah bilangan Genap : 1-30:");
        
        for(int i = start; i < limit; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n" + garis);
        /*
        *   Menampilkan bilangan genap dengan Scanner
        */
        
        System.out.println("Masukkan bilangan awal");
        start = inputUser.nextInt();
        
        System.out.println("Masukkan bilangan akhir");
        limit = inputUser.nextInt();
        
        System.out.println("\nBerikut adalah bilangan Genap : 1-30:");
        for (int i = start; i < limit; i++) {
            if(i != 0 && i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        
        System.out.println("\n" + garis);
        
        for(int i = start; i < limit; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        
        System.out.println("\n" + garis);
        /*
        *   Bilangan checker
        */
        System.out.println("Masukkan bilangan:");
        bilangan = inputUser.nextInt();
        inputUser.close();
     
        System.out.println("Check Bilangan = " + bilangan);
        if(bilangan != 0 && bilangan % 2 == 0){
            System.out.println("Anda baru saja memasukkan bilangan Genap");
        } else {
            System.out.println("Anda baru saja memasukkan bilangan Ganjil");
        }
        
        System.out.println("\n" + garis);
    }
}
