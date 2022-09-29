package Mang_baitap;

import java.util.Scanner;
public class Bai2_themphantutrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int[] old = new int[n];
        System.out.println("nhap cac gia tri phan tu cua mang");
        for (int i = 0; i < old.length; i++) {
            old[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi them");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", old[i]);
        }
        System.out.println();
        System.out.println("nhap gia tri can them trong mang");
        int ValueInsert = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao chi so can them trong mang");
        int indexInsert = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[old.length + 1];
        for (int i = 0; i < arrNew.length; i++) {
            if (i < indexInsert) {
                arrNew[i] = old[i];
            } else if (i == indexInsert) {
                arrNew[i] = ValueInsert;
            } else {
                arrNew[i] = old[i - 1];
            }
        }
        System.out.println("mang sau khi them la");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t", arrNew[i]);
        }
    }
}

