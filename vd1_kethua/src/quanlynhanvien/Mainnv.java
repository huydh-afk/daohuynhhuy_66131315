package quanlynhanvien;

public class Mainnv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhanvien nv1=new Nhanvien("1","pphat",2345);
		System.out.print(nv1.toString());
		nv1.hienThiThongTin();
		System.out.println(" ");
		
		Nhanvienvp nv2=new Nhanvienvp("002", "Trần Thị Tươi Thắm", 2300000, 3, 200000);
		System.out.print(nv2.toString());
		nv2.hienThiThongTin();
		System.out.println(" ");
		QuanLy ql = new QuanLy("003", "Nguyễn Văn A", 5000000, 1000000, 2.0);
        System.out.println(ql.toString());
        
        ql.hienThiThongTin();
        ql.hopBanGiamDoc();
        System.out.println(" ");

        // Nhân viên kinh doanh
        NhanVienKinhDoanh kd = new NhanVienKinhDoanh("004", "Lê Văn B", 3000000, 20000000, 5);
        System.out.println(kd.toString());
        kd.hienThiThongTin();
        kd.chamSocKhachHang();
	}

}
