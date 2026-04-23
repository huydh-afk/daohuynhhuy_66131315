package thigk2.daohuynhhuy;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;

    public SanPham(String maSP, String tenSP, String loaiSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
    }

    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }
    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }
    public String getLoaiSP() { return loaiSP; }
    public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }
    public double getGiaBan() { return giaBan; }
    public void setGiaBan(double giaBan) { this.giaBan = giaBan; }

    @Override
    public String toString() {
        return "Mã: " + maSP + ", Tên: " + tenSP + ", Loại: " + loaiSP + ", Giá: " + giaBan;
    }
}

class Main {
    /* * TÓM TẮT CÁCH GIẢI CÂU 2:
     * - Sử dụng ArrayList để quản lý danh sách các đối tượng SanPham.
     * - Khởi tạo nhanh (hard-code) 3 sản phẩm và dùng vòng lặp for-each để xuất dữ liệu.
     * - Dùng lớp Scanner kết hợp với các phương thức nextLine(), nextDouble() để nhận dữ liệu mới.
     * - Dùng phương thức equalsIgnoreCase() để so sánh chuỗi khi lọc loại "Thực phẩm chức năng".
     */
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // a
        list.add(new SanPham("SP01", "Sữa Alpha", "Thực phẩm", 500000));
        list.add(new SanPham("SP02", "Omega 3", "Thực phẩm chức năng", 320000));
        list.add(new SanPham("SP03", "Yến sào", "Thực phẩm chức năng", 1200000));

        System.out.println("Danh sách sản phẩm ban đầu:");
        for (SanPham sp : list) System.out.println(sp);

        // b
        System.out.println("\n Nhập sản phẩm mới");
        System.out.print("Mã: "); String ma = sc.nextLine();
        System.out.print("Tên: "); String ten = sc.nextLine();
        System.out.print("Loại: "); String loai = sc.nextLine();
        System.out.print("Giá: "); double gia = sc.nextDouble();
        list.add(new SanPham(ma, ten, loai, gia));

        // In lại toàn bộ
        System.out.println("\nDanh sách sau khi cập nhật:");
        for (SanPham sp : list) System.out.println(sp);

        // Lọc Thực phẩm chức năng
        System.out.println("\nCác loại Thực phẩm chức năng:");
        for (SanPham sp : list) {
            if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
                System.out.println(sp);
            }
        }
    }
}