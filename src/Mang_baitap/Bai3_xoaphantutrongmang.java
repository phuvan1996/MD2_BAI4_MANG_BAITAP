package Mang_baitap;

import java.util.Scanner;

public class Bai3_xoaphantutrongmang {
    public static void main(String[] args) {
        int daySo[] = {1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTu(daySo,soCanXoa);
        if (viTriCanXoa==-1){
            System.out.println("phan tu khong co trong mang");
        }else {
            daySo = xoaPhanTu(daySo,viTriCanXoa);
            for (int i = 0; i < daySo.length; i++) {
                System.out.print(daySo[i]+"\t");

            }
        }
    }
    static int timViTriPhanTu(int[] dayso,int phantu){
        int viTri = -1;
        for (int i = 0; i < dayso.length; i++) {
            if (dayso[i]== phantu){
                viTri = i;
            }
        }
        return viTri;
    }
    static int[] xoaPhanTu(int[] dayso,int viTri){
        int[] daySoMoi = new int[dayso.length-1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = dayso[i];
        }
        for (int i = viTri+1;i<dayso.length;i++) {
            daySoMoi[i-1] = dayso[i];
        }
        return daySoMoi;
    }
}
