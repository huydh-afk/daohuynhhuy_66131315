package quanlynhanvien;

public class QuanLy extends Nhanvien {
	private double phuCapChucVu;
    private double heSoKinhNghiem;
    
    public QuanLy(String manv, String ht, double luongcb, double phuCapChucVu, double heSoKinhNghiem) {
        super(manv, ht, luongcb);
        this.phuCapChucVu = phuCapChucVu;
        this.heSoKinhNghiem = heSoKinhNghiem;
    }
    
    @Override
    public double tinhluong() {
        return (getLuongcoban() * heSoKinhNghiem) + phuCapChucVu;
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
        System.out.println("Hệ số kinh nghiệm: " + heSoKinhNghiem);
        System.out.println("Tổng lương: " + this.tinhluong());
        System.out.println("Chức vụ: Quản lý");
    }
    
    // Phương thức riêng của quản lý
    public void hopBanGiamDoc() {
        System.out.println(getHoTen() + " đang họp với ban giám đốc...");
}
}
