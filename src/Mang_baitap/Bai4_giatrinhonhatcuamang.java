package Mang_baitap;

import java.util.Scanner;

public class Bai4_giatrinhonhatcuamang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[n];
        System.out.println("nhap gia tri cua mang");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("phan tu cua mang la");
        for (int i = 0; i <arr.length; i++) {
            System.out.printf("%d\n",arr[i]);
        }    int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
          if (min>arr[i]){
              min = arr[i];
          }
        }System.out.printf("gia tri nho nhat la:%d\n",min);
    }
}
