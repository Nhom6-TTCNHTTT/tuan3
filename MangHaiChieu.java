package Function_Oriented;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MangHaiChieu {
	// Phương thức nhập vào kích thước mảng
	public static int size_input(Scanner sc) {
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

	// Phương thức nhập vào phần tử của mảng
	public static int ele_input(Scanner sc) {
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

	// Phương thức hiển thị ra mảng
	public static void display(int a[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.printf("%6s", a[i][j]);
			System.out.println();
		}
	}

	// Phương thức kiểm tra số nguyên tố
	public static boolean prime_num(int n) {
		if (n <= 0)
			return false;
		for (int i = 2; i <= Math.sqrt((double) n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	// Phương thức trả về số nguyên lớn nhất trong mảng 2 chiều
	// Nếu không có số nguyên nào thì trả về 0
	public static int highest_prime_num(int a[][], int n, int m) {
		int max = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (a[i][j] > max && prime_num(a[i][j]))
					max = a[i][j];
		return max;
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Tìm số nguyên tố lớn nhất trong mảng 2 chiều");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng của mảng: ");
		int n = size_input(sc);
		System.out.print("Nhập số cột của mảng: ");
		int m = size_input(sc);
		int a[][] = new int[n][m];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print("Nhập a[" + i + "][" + j + "] = ");
				a[i - 1][j - 1] = ele_input(sc);
			}
		}
		System.out.println("Mảng đã nhập là:");
		display(a, n, m);
		sc.close();
		System.out.println("-------------------------------------------------");
		int max = highest_prime_num(a, n, m);
		if (max == 0)
			System.out.println("Mảng không có số nguyên tố nào");
		else
			System.out.println("Số nguyên tố lớn nhất trong mảng là: " + max);
	}
}
