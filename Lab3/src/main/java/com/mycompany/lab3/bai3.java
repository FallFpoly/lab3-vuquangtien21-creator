/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[];
        int n;
        System.out.print("nhap n: ");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
        System.out.println("nhap pt thu"+i+":");
        }
        for(int i=0;i<n;i++){
            System.out.println("pt tu thu: "+a[i]);
        }
        for (int x:a){
            System.out.println("x: "+x);
    }
        Arrays.toString(a);
        System.out.println("xuat to String: "+Arrays.toString(a));
        int i=Arrays.binarySearch(a,0);
        System.out.println("vi tri gia tri pt thu: "+i);
        System.out.println("vi tri: "+Arrays.binarySearch(a,0));
        Arrays.fill(a,9);
        System.out.println("gan gia tri pt =0"+Arrays.toString(a));
    }
}
