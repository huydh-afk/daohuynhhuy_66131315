// Import lớp Scanner
import java.util.Scanner;

public class Baitap1_Tinhtonghaiso {

	public static void main(String[] args) {
		// Nhập dữ liệu từ bàn phím 
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        // Tính tổng 2 số và in ra
        double sum = num1 + num2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f", num1, num2, sum);

        
        scanner.close();
	}

}
