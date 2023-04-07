package Function_Oriented;

import java.util.InputMismatchException;
import java.util.Scanner;


//Viết chương trình cắt ra một số lượng từ nhất định trong một chuỗi đã cho.

public class Bai19 {
	public static String a;

	// Phương thức nhập vào kích thước mảng
	public static int int_input(Scanner sc) {
		int n = 0;
		boolean check = true;
		while (check) {
			try {
				n = sc.nextInt();
				if (n <= 0)
					System.out.print("Bạn phải nhập 1 số nguyên > 0.\nNhập lại: ");
				else
					check = false;
			} catch (InputMismatchException e) {
				System.out.print("Bạn phải nhập 1 số nguyên > 0.\nNhập lại: ");
				sc.nextLine();
			}
		}
		return n;
	}

	// Phương thức cắt 1 số từ trong chuỗi
	public static void cut(int n) {
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
		System.out.println("Cắt ra 1 số lượng từ nhất định trong 1 chuỗi đã cho");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		a = sc.nextLine();
		int n = 0;
		System.out.print("Nhập số từ muốn cắt khỏi chuỗi: ");
		n = int_input(sc);
		sc.close();
		System.out.println("-------------------------------------------------");
		cut(n);
		System.out.println("Chuỗi sau khi cắt là: " + a);
	}
}
