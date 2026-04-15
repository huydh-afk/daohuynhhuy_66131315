package vdtrang72;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Ví dụ: Dùng BufferedReader đọc từng ký tự từ Console. Việc đọc kết thúc khi gặp dấu chấm
		//(dấu chấm để kết thúc chương trình).
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		 // read characters
		do
		{
		c = (char) br.read();
		System.out.print(c);
		} while(c != '.'); 
	}

}
