package vd2;
import java.io.PrintWriter;
import java.io.IOException;
public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ví dụ: minh họa dùng PrintWriter để xuất dữ liệu ra Console 
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.67;
		double r = i+d;
		pw.println("Using a PrintWriter.");
		pw.println(i);
		pw.println(d);
		pw.println(i + " + " + d + " = " + r);
	}

}
