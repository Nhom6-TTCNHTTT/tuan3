package Function_Oriented;

import java.util.Scanner;


//Đếm xem trong một chuỗi xuất hiện bao nhiêu từ. “Hello world” -> 2

public class Bai16 {
	// Phương thức trả về số từ trong 1 chuỗi
	public static int count(String a) {
		int c = 0, i = 0, l = a.length();
		if (a.charAt(0) != ' ')
			c = 1;
		while (i < l - 1) {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
				c++;
			i++;
		}
		return c;
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Đếm số từ trong 1 chuỗi");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String a = sc.nextLine();
		sc.close();
		System.out.println("-------------------------------------------------");
		System.out.println("Chuỗi trên có " + count(a) + " từ");
	}
}
