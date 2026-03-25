package quanlynhanvien;

public class Nhanvien {
	private String maNV;
	private String hoTen;
	private double luongcoban;
//	public Nhanvien() {
//		maNV="0";
//		hoTen="ABC";
//		luongcoban=1000;
//	}
	public Nhanvien(String maNhanVien,String tenNhanVien,double luongCB) {
		this.maNV=maNhanVien;
		this.hoTen=tenNhanVien;
		this.luongcoban=luongCB;
	}
	public Nhanvien() {
		super();
	}
	public double tinhluong() {
		return luongcoban;
	}
	@Override
	
//	public String toString() {
//		String chuoiXuat="";
//		chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
//		chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
//		chuoiXuat = chuoiXuat + "\nLương cơ bản: " + this.luongCoBan;
//		return chuoiXuat;
	public String toString() {
		return "Nhanvien[ma nhan vien:"+maNV+",ho ten:"+hoTen+",luong co ban:"+luongcoban+"]"; 
	}
	public void hienThiThongTin() {
		System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongcoban);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongcoban() {
		return luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	
}
