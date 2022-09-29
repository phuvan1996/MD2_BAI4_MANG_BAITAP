package Mang_baitap;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so doh cua ma tran");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao so cot cua ma tran");
        int m = Integer.parseInt(scanner.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("nhap gia tri cac phan tu cua ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j]= Float.parseFloat(scanner.nextLine());
            }
        }
        System.out.println("nhap vao chi so cot cua ma tran can tinh tong la:");
        int colindex = Integer.parseInt(scanner.nextLine());
        float sum = 0 ;
        for (int i = 0; i < n; i++) {
            sum +=matran[i][colindex];
        }
        System.out.printf("tong gia tri cac phan tu nam tren cot %d la : %f\n",colindex,sum);
    }
}
