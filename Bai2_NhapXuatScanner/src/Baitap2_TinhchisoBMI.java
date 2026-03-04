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
        
        System.out.printf("PTn=== KẾT QUẢ ===PTn");
        System.out.printf("Cân nặng: PT.1f kgPTn", weight);
        System.out.printf("Chiều cao: PT.2f mPTn", height);
        System.out.printf("Chỉ số BMI: PT.2fPTn", bmi);
        // Điều kiện BMI và in ra kết quả
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
        
        scanner.close();
	}

}
