package Mang_baitap;

import java.util.Scanner;

public class Bai3_gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao phan tu mang");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[array1.length+array2.length];
        System.out.println("nhap gia tri cho mang 1");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(scanner.nextLine());
        } System.out.println("nhap gia tri cho mang 2");
        for (int j = 0; j < array1.length; j++) {
            array2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("gia tri cua mang 1 la:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n",array1[i]);
        }
        System.out.println("gia tri cua mang 2 la:");
         for (int j = 0; j < n; j++) {
            System.out.printf("%d\n",array2[j]);
        }
        System.out.println("gia tri mang 3 la:");
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array2.length+j] = array2[j];
        }
        System.out.printf("%d\n",array3[n]);
    }
}