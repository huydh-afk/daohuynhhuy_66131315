package vuongpq;
import java.util.Scanner;
import java.util.ArrayList;
public class runMain {

	public static void main(String[] args) {
		// 2a Tao moi 2 hoc sinh (DL Hard-Core)
        HocSinh hs1 = new HocSinh();
        String tenHS1 = "Tran Van A";
        hs1.setTenHS(tenHS1);
        short tuoiHS1 = 14;
        hs1.setTuoiHS(tuoiHS1);
        String lopHS1 = "8A-12";
        hs1.setLopHS(lopHS1);
        
        HocSinh hs2 = new HocSinh("Tran Thi Tuoi", (short)12, "6C");
        //in ra man hinh 
        System.out.println(hs1.toString());
        System.out.println(hs2.toString());
        
//        System.out.println("Ten hoc sinh 2: " + hs2.getTenHS());
//        System.out.println("Tuoi hoc sinh 2: " + hs2.getTuoiHS());
//        System.out.println("Lop hoc sinh 2: " + hs2.getLopHS());
        
        //Nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        //2b. nhap hoc sinh thu 3
        System.out.println("\n2b: Nhap hoc sinh thu 3");
		HocSinh hs3 = new HocSinh();
		System.out.print("Nhap ten: ");
		hs3.setTenHS(scanner.nextLine());
		System.out.print("Nhap tuoi: ");
		hs3.setTuoiHS(scanner.nextShort());
		scanner.nextLine();
		System.out.print("Nhap lop: ");
		hs3.setLopHS(scanner.nextLine());
		System.out.println(hs3.toString());
        
        //3a. nhap danh sach N hoc sinh
        ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
        System.out.print("Nhap so luong hoc sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
        	//nhap hoc sinh thu i
        System.out.println("\nNhap hoc sinh thu " + (i+1));
     	HocSinh hs = new HocSinh();
		System.out.print("Nhap ten: ");
		hs.setTenHS(scanner.nextLine());
		System.out.print("Nhap tuoi: ");
		hs.setTuoiHS(scanner.nextShort());
		scanner.nextLine();
		System.out.print("Nhap lop: ");
		hs.setLopHS(scanner.nextLine());
			
			dsHocSinh.add(hs);
        }
        //3b. in ra danh sach vua nhap
        System.out.println("\n3b: Danh sach vua nhap");
		for(HocSinh hs : dsHocSinh) {
			System.out.println(hs.toString());
		}
		// 4a Bo sung them 1 hoc sinh
			System.out.println("\n4a: Them hoc sinh");
			HocSinh hsThem = new HocSinh();		
			System.out.print("Nhap ten: ");
			hsThem.setTenHS(scanner.nextLine());
			System.out.print("Nhap tuoi: ");
			hsThem.setTuoiHS(scanner.nextShort());
			scanner.nextLine();
			System.out.print("Nhap lop: ");
			hsThem.setLopHS(scanner.nextLine());				
			dsHocSinh.add(hsThem);	
			
		// 4b Xuat lai danh sach
			System.out.println("\n4b: Danh sach sau khi them");
			for(int i = 0; i < dsHocSinh.size(); i++) {
				System.out.println(dsHocSinh.get(i).toString());
			}
		//5a.Tim hoc sinh ten Hoa trong danh sach
			for(int i = 0; i < dsHocSinh.size(); i++) {
				HocSinh hsTim = dsHocSinh.get(i);
				if(hsTim.getTenHS().equalsIgnoreCase("Hoa")) {
					dsHocSinh.remove(i);
					break;
				}
			}
			System.out.println("\n5b: Xuat lai danh sach");
			for(int i = 0; i < dsHocSinh.size(); i++) {
				System.out.println(dsHocSinh.get(i).toString());
			}
	}
}
