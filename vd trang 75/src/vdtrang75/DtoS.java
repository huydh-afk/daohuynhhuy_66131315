package vdtrang75;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {

	public static void main(String[] args) throws IOException {
		//đọc và hiển thị nội dung của file “test.txt” lên màn hình. 
		FileReader fr = new FileReader("D:\\testUnicode.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null)
		{
		System.out.println(s);
		}
		fr.close();

	}

}
