package com.pelitabangsa.algoritma;

public class BubbleSort {

    public static void main(String[] args) {
        int i, j, swap;
        String garis = "______________________________________";        
        int[] array = {11, 3, 8, 1, 20};
        int[] array2 = {10,3, 8, 1, 50};
        
        System.out.println(garis + "\n");
        System.out.println("       PROGRAM GANJIL GENAP");
        System.out.println("Nama: Mahrus Sayid   Kelas: TI22 C3");
        System.out.println(garis + "\n");

        for (i = 0; i < (array.length - 1); i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("\n\nBilangan Ascending adalah :");
        
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        
        for (i = 0; i < (array2.length - 1); i++) {
            for (j = 0; j < array2.length - i - 1; j++) {
                if (array2[j] < array2[j + 1]) {
                    swap = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = swap;
                }
            }
        }
        
        System.out.println("\n" + garis + "\n");
        
        System.out.println("\n\nBilangan Descending adalah :");
        for (i = 0; i < array.length; i++) {
            System.out.print(array2[i] + ",");
        }
    }
}