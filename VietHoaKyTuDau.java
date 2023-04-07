package Function_Oriented;

import java.util.Scanner;


//Viết chương trình viết hoa chỉ các ký tự đầu từ trong một chuỗi. “Nguyễn Văn Abc”

public class Bai17 {
	public static String a;

	// Phương thức viết hoa kí tự đầu các từ trong 1 chuỗi
	public static void format() {
		int i = 0, l = a.length();
		if (a.charAt(0) != ' ') {
			Character ch = a.charAt(0);
			a = a.replaceFirst(ch.toString(), ch.toString().toUpperCase());
		}

		while (i < l - 1) {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ') {
				Character ch = a.charAt(i + 1);
				a = a.replaceFirst(ch.toString(), ch.toString().toUpperCase());
			}
			i++;
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Viết hoa chữ cái đầu của các từ trong 1 chuỗi");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		a = sc.nextLine();
		sc.close();
		System.out.println("-------------------------------------------------");
		format();
		System.out.println("Chuỗi sau khi viết hoa là: " + a);
	}
}
