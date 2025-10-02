/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;
 import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int N = sc.nextInt();
        
        // Kiểm tra số nguyên tố
        boolean ok = true;
        
        // Kiểm tra các trường hợp đặc biệt
        if (N < 2) {
            ok = false;
        } else {
            // Vòng lặp kiểm tra từ 2 đến N-1
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }
        
        // Hiển thị kết quả
        if (ok) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }
        
        sc.close();
    }
}