package Mang_baitap;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("nhap vao so dong va so cot cua ma tran");
        int n = Integer.parseInt(scanner.nextLine());
        float[][] matran = new float[n][n];
        System.out.println("nhap gia tri cac phna tu cua ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j]= Float.parseFloat(scanner.nextLine());
            }
        }
        float sumChinh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    System.out.printf("%f\t",matran[i][j]);
                    sumChinh+=matran[i][j];
                }
            }
        }
        System.out.printf("\n");
        System.out.println("tong cac phan tu nam tren duong cheo chinh la :"+sumChinh);
        System.out.println("cac phan tu nawm tren duong cheo phu"+sumChinh);
    }
}
