// Import lớp Scanner
import java.util.Scanner;
public class Baitap2_TinhchisoBMI {

	public static void main(String[] args) {
		// Nhập dữ liệu chiều cao cân nặng từ bàn phím và tính toán và in ra
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHỈ SỐ BMI ===");
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        
        
        scanner.close();
	}

}
