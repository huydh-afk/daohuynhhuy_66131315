
public class Baitap4_Tinhtiendien {

	public static void main(String[] args) {
			// Khai báo dữ liệu điện
		 int soDien = 250;  // kWh
	     double tienDien = 0;
	     // Điều kiện và tính tiền điện
	     if (soDien <= 50) {
	            tienDien = soDien * 1678;
	        } else if (soDien <= 100) {
	            tienDien = 50 * 1678 + (soDien - 50) * 1734;
	        } else if (soDien <= 200) {
	            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
	        } else if (soDien <= 300) {
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
	        } else {
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
	        }
	     // In kết quả tiền điện thông tin điện
	     	System.out.println("Số điện: " + soDien + " kWh");
	        System.out.println("Tiền điện: " + tienDien + " đồng");
	        System.out.println("Tiền điện (VND): " + String.format("%,.0f", tienDien) + " đ");

	}

}
