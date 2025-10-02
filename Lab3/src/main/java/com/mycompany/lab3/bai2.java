/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        // Vòng lặp ngoài cho i từ 1 đến 9 (các bảng nhân)
        for (int i = 1; i <= 9; i++) {
            // Vòng lặp trong cho j từ 1 đến 10 (các phép nhân trong mỗi bảng)
            for (int j = 1; j <= 10; j++) {
                // In ra phép nhân: i x j = kết quả
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
            // In một dòng trống sau mỗi bảng để dễ đọc
            System.out.println();
        }
    }
}
