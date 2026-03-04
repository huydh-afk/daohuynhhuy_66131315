
public class Baitap4_Tinhtiendien {

	public static void main(String[] args) {
			// Khai báo dữ liệu điện
		 int soDien = 250;  // kWh
	     double tienDien = 0;
	     // Điều kiện và tính tiền điện
	   
	     // In kết quả tiền điện thông tin điện
	     	System.out.println("Số điện: " + soDien + " kWh");
	        System.out.println("Tiền điện: " + tienDien + " đồng");
	        System.out.println("Tiền điện (VND): " + String.format("%,.0f", tienDien) + " đ");

	}

}
