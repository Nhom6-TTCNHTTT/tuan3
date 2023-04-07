package Function_Oriented;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UCLN {
	// Phương thức nhập vào 1 số
	public static int input(Scanner sc) {
		int n = 0;
		boolean check = true;
		while (check) {
			try {
				n = sc.nextInt();
				check = false;
			} catch (InputMismatchException e) {
				System.out.print("Bạn phải nhập 1 số nguyên.\nNhập lại: ");
				sc.nextLine();
			}
		}
		return n;
	}

	// Phương thức trả về ước chung lớn nhất của 2 số nguyên khác 0
	public static int greatest_common_divisor(int a, int b) {
		if (b == 0)
			return a;
		int temp = a % b;
		while (temp != 0) {
			a = b;
			b = temp;
			temp = a % b;
		}
		return Math.abs(b);
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Tìm ước chung lớn nhất của 2 số a và b");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên a: ");
		int a = input(sc);
		System.out.print("Nhập số nguyên b: ");
		int b = input(sc);
		sc.close();
		System.out.println("-------------------------------------------------");
		if (a == 0 && b == 0)
			System.out.println("Không có ước chung lớn nhất");
		else
			System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + greatest_common_divisor(a, b));
	}
}
