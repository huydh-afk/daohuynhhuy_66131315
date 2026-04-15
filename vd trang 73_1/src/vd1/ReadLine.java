package vd1;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadLine {

	public static void main(String[] args) throws IOException {
		//Dùng BufferedReader đọc chuỗi ký tự từ Console. Chương trình kết thúc khi gặp chuỗi
		//đọc là chuỗi “stop” 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Nhap chuoi.");
		System.out.println("Nhap 'stop' ket thuc chuong trinh.");
		do
		{
		str = br.readLine();
		System.out.println(str);
		} while(!str.equals("stop")); 
	}

}
