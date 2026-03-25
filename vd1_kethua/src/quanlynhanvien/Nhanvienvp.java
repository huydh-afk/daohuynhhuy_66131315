package quanlynhanvien;

public class Nhanvienvp extends Nhanvien{
	private double sogiolamthem;
	private double luongthemmoigio;
	public Nhanvienvp(String manv,String ht,double lcb,double sogio,double luonggio) {
		super(manv,ht,lcb);
		sogiolamthem=sogio;
		luongthemmoigio=luonggio;
	}
	@Override
	public double tinhluong() {
		return super.getLuongcoban()+sogiolamthem*luongthemmoigio;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm : " + sogiolamthem);
        System.out.println("Lương cho mỗi giờ làm thêm : " + luongthemmoigio);
        System.out.println("Lương được nhận: " + tinhluong());
	}
	
	@Override
	public String toString() {
		String chuoiXuat=super.toString();
		chuoiXuat = chuoiXuat + "\nSố giờ làm thêm : " + sogiolamthem;
		chuoiXuat = chuoiXuat + "\nLương cho mỗi giờ làm thêm : " + luongthemmoigio;
		chuoiXuat = chuoiXuat + "\nLương được nhận: " + tinhluong();
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
}
