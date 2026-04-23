package thigk2.daohuynhhuy;

import java.util.Scanner;

/*
 * - tóm tắt lời giải:
 * - nhập vào toạ độ góc trên-trái (x1, y1) và dưới phải (x2, y2)
 * - tính chiều dài = |x2 - x1|
 * - tính chiều rộng = |y1 - y2|
 * - Chu vi = 2 * (chiều dài + chiều rộng)
 * - diện tích = chiều dài * chiều rộng
 * - in kết quả ra màn hình
 */

public class HinhChuNhat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2;

        System.out.print("Nhap x1: ");
        x1 = sc.nextDouble();

        System.out.print("Nhap y1: ");
        y1 = sc.nextDouble();

        System.out.print("Nhap x2: ");
        x2 = sc.nextDouble();

        System.out.print("Nhap y2: ");
        y2 = sc.nextDouble();

        double chieuDai = Math.abs(x2 - x1);
        double chieuRong = Math.abs(y1 - y2);

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hinh chu nhat = " + chuVi);
        System.out.println("Dien tich hinh chu nhat = " + dienTich);

        sc.close();
    	}
    }