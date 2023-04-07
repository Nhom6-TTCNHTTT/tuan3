PhucDinhPhucDinh;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhToHop {
	// Phương thức nhập vào 1 số
	public static int input(Scanner sc) {
		int n = 0;
		boolean check = true;
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
		return n;
	}

	// Phương thức tính tổ hợp
	public static long combination(int n, int m) {
		if (m == 0 || m == n)
			return 1;
		else {
			long a = 1, b = 1;
			for (int i = m; i <= n; i++)
				a *= i;
			for (int i = 1; i <= n - m; i++)
				b *= i;
			return a/b;
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Tính C(m,n)");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên m (m >= 0): ");
		int m = input(sc);
		System.out.print("Nhập số nguyên n (n >= " + m + "): ");
		int n = input(sc);
		while(n < m) {
			System.out.print("Bạn phải nhập n lớn hơn " + m + "\nNhập lại: ");
			n = input(sc);
		}
		sc.close();
		System.out.println("-------------------------------------------------");
		System.out.println("C(" + m + "," + n + ") = " + combination(n,m));
	}
}
