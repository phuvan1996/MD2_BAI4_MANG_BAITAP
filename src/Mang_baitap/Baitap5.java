package Mang_baitap;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so dong cua ma tran");
        int n= Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao so cot cua ma tran");
        int m = Integer.parseInt(scanner.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("nhap gia tri cac phan tu cua ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("matran[%d][%d] =",i,j);
                matran[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        float max = matran[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max<matran[i][j]){
                    max = matran[i][j];
                }
            }
        }
        System.out.println("toa do va gia tri cac phan tu lon nhat la :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matran[i][j]==max){
                    System.out.printf("toa do:(%d,%d)- gia tri %f\n ",i,j,matran[i][j]);
                }
            }

        }
    }
}
