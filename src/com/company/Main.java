package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x,y,i,j;
        int[][] array1,array2,sum;
        //khai bao kich mang
        System.out.println("nhap vao chieu dai cua 2 mang:");
        x = scanner.nextInt();
        System.out.println("nhap vao chieu rong cua 2 mang:");
        y = scanner.nextInt();
        array1 = new int[x][y];
        array2 = new int[x][y];
        sum = new int[x][y];
        //Nhap gia tri cho 2 mang
        for(i=0;i<array1.length;i++){
            for(j=0;j<array1[i].length;j++){
                System.out.print("nhap gia tri cot" + (j+1) +"hang" + (i+1)+"cua mang 1:");
                array1[i][j]=scanner.nextInt();
            }
        }
        for(i=0;i<array2.length;i++){
            for(j=0;j<array2[i].length;j++){
                System.out.print("nhap gia tri cot" + (j+1) +"hang" + (i+1)+"cua mang 2:");
                array2[i][j]=scanner.nextInt();
            }
        }
        //In ra phan tu cua 2 mang
        System.out.println("Bang gia tri ma tran 1:");
        for(i=0;i<array1.length;i++){
            System.out.print("\n");
            for(j=0;j<array1[i].length;j++){
                System.out.print(array1[i][j]+"\t");
            }
        }
        System.out.println("\nBang gia tri ma tran 2:");
        for(i=0;i<array2.length;i++){
            System.out.print("\n");
            for(j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+"\t");
            }
        }
        //Tinh va in ra tong cua 2 mang
        System.out.println("\nDay la ma tran tong 2 ma tran: ");
        for(i=0;i<sum.length;i++){
            System.out.print("\n");
            for(j=0;j<sum.length;j++){
                sum[i][j]=array1[i][j]+array2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
        }
    }
}
