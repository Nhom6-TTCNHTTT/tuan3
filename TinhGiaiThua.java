PhucDinhPhucDinh;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhGiaiThua {
	// Phương thức nhập vào 1 số
	public static int input() {
		int n = 0;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		while (check) {
			try {
				n = sc.nextInt();
				if (n < 0)
					System.out.print("Bạn phải nhập 1 số nguyên >= 0.\nNhập lại: ");
				else
					check = false;
			} catch (InputMismatchException e) {
				System.out.print("Bạn phải nhập 1 số nguyên >= 0.\nNhập lại: ");
				sc.nextLine();
			}
		}
		sc.close();
		return n;
	}

	// Phương thức tính giai thừa
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else {
			long s = 1;
			for (int i = 1; i <= n; i++)
				s *= i;
			return s;
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Tính n!");
		System.out.println("-------------------------------------------------");
		System.out.print("Nhập số nguyên n (n >= 0): ");
		int n = input();
		System.out.println("-------------------------------------------------");
		System.out.println(n + "! = " + factorial(n));
	}
}
