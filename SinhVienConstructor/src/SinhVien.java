public class SinhVien {
    private String ten;
    private int tuoi;
    private String maSV;
    private double diemTB;
    public SinhVien() {
        this.ten = "Chưa có tên";
        this.tuoi = 18;
        this.maSV = "SV000";
        this.diemTB = 0.0;
    }
    // Constructor có tham số
    public SinhVien(String ten, int tuoi, String maSV) {
        this.ten = ten;
        this.setTuoi(tuoi);  // Sử dụng setter để validate
        this.maSV = maSV;
        this.diemTB = 0.0;
    }
    // GETTER - Lấy giá trị thuộc tính
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }
    // SETTER - Gán giá trị với kiểm tra
    public void setTen(String ten) {
        if (ten != null && !ten.trim().isEmpty()) {
            this.ten = ten;
        } else {
            System.out.println("Tên không hợp lệ");
        }
    }

    public void setTuoi(int tuoi) {
        if (tuoi >= 18 && tuoi <= 50) {
            this.tuoi = tuoi;
        } else {
            System.out.println("Tuổi phải từ 18 đến 50");
            this.tuoi = 18;  // Giá trị mặc định
        }
    }

    public void setMaSV(String maSV) {
        if (maSV != null && maSV.startsWith("SV")) {
            this.maSV = maSV;
        } else {
            System.out.println("Mã SV phải bắt đầu bằng 'SV'");
        }
    }

    public void setDiemTB(double diemTB) {
        if (diemTB >= 0.0 && diemTB <= 10.0) {
            this.diemTB = diemTB;
        } else {
            System.out.println("Điểm TB phải từ 0.0 đến 10.0!");
        }
    }
}
