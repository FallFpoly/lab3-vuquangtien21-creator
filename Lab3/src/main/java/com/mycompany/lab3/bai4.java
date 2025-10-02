/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa
        
        // Khai báo mảng họ tên và điểm
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        
        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            hoTen[i] = sc.nextLine();
            System.out.print("Điểm: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // Đọc bỏ dòng thừa
        }
        
        // Xuất thông tin sinh viên trước khi sắp xếp
        System.out.println("\nDANH SÁCH SINH VIÊN TRƯỚC KHI SẮP XẾP:");
        xuatDanhSach(hoTen, diem);
        
        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        sapXepTheoDiem(hoTen, diem);
        
        // Xuất thông tin sinh viên sau khi sắp xếp
        System.out.println("\nDANH SÁCH SINH VIÊN SAU KHI SẮP XẾP:");
        xuatDanhSach(hoTen, diem);
        
        sc.close();
    }
    
    // Phương thức xác định học lực
    public static String xacDinhHocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    
    // Phương thức xuất danh sách sinh viên
    public static void xuatDanhSach(String[] hoTen, double[] diem) {
        System.out.println("+------------------------------------------------+");
        System.out.println("| STT | Họ tên           | Điểm | Học lực       |");
        System.out.println("+------------------------------------------------+");
        
        for (int i = 0; i < hoTen.length; i++) {
            String hocLuc = xacDinhHocLuc(diem[i]);
            System.out.printf("| %-3d | %-15s | %-4.1f | %-13s |\n", 
                            (i + 1), hoTen[i], diem[i], hocLuc);
        }
        
        System.out.println("+------------------------------------------------+");
    }
    
    // Phương thức sắp xếp danh sách sinh viên theo điểm (tăng dần)
    public static void sapXepTheoDiem(String[] hoTen, double[] diem) {
        int n = diem.length;
        
        // Sử dụng thuật toán sắp xếp nổi bọt
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    // Hoán đổi điểm
                    double tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;
                    
                    // Hoán đổi họ tên
                    String tempHoTen = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempHoTen;
                }
            }
        }
    }
}
