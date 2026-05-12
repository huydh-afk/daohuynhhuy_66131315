package thigk2.daohuynhhuy;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DocFileVB {

    /*
     * TÓM TẮT CÁCH GIẢI CÂU 3:
     * - Khởi tạo file data.txt chứa 80 số thực (giả lập dữ liệu sinh viên tự tạo).
     * - Sử dụng lớp File và Scanner để đọc từng dòng từ file vào ArrayList<Double>.
     * - Duyệt danh sách để in ra màn hình.
     * - So sánh từng phần tử với giá trị X (ngày sinh sinh viên) để kết luận.
     */
    public static void main(String[] args) {
        String tenFile = "data.txt";
        double X = 23.0;
        
        taoDuLieuMau(tenFile, X);

        ArrayList<Double> dsSoThuc = new ArrayList<>();

        try {
            File f = new File(tenFile);
            Scanner reader = new Scanner(f);

            while (reader.hasNextDouble()) {
                dsSoThuc.add(reader.nextDouble());
            }
            reader.close();

            // a. In ra màn hình danh sách số thực đã đọc
            System.out.println("=== DANH SÁCH 80 SỐ THỰC TỪ FILE ===");
            for (int i = 0; i < dsSoThuc.size(); i++) {
                System.out.print(dsSoThuc.get(i) + "\t");
                if ((i + 1) % 8 == 0) System.out.println(); // Xuống dòng mỗi 8 số cho đẹp
            }

            // b. Kiểm tra giá trị X có trong danh sách hay không
            System.out.println("\n-----------------------------------------");
            System.out.println("Kiểm tra ngày sinh X = " + X);
            
            boolean timThay = false;
            for (Double so : dsSoThuc) {
                if (so == X) {
                    timThay = true;
                    break;
                }
            }

            if (timThay) {
                System.out.println("=> KẾT QUẢ: Giá trị " + X + " CÓ trong danh sách.");
            } else {
                System.out.println("=> KẾT QUẢ: Giá trị " + X + " KHÔNG có trong danh sách.");
            }

        } catch (Exception e) {
            System.out.println("Lỗi: Không tìm thấy file hoặc định dạng file sai!");
            e.printStackTrace();
        }
    }

    // Hàm bổ trợ để tạo file txt có 80 số thực ngay trong Project
    public static void taoDuLieuMau(String tenFile, double ngaySinh) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(tenFile))) {
            // Ghi ngày sinh vào trước để chắc chắn tìm thấy khi chạy thử
            pw.println(ngaySinh);
            // Ghi thêm 79 số ngẫu nhiên
            for (int i = 1; i < 80; i++) {
                double giaTri = Math.random() * 100;
                pw.printf("%.2f\n", giaTri);
            }
        } catch (Exception e) {
            System.out.println("Không thể tạo file data.txt");
        }
    }
}