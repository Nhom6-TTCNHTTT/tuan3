package Function_Oriented;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaTran {
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

	// Phương thức nhập vào phần tử của mảng
	public static double double_input(Scanner sc) {
		double n = 0;
		boolean check = true;
		while (check) {
			try {
				n = sc.nextDouble();
				check = false;
			} catch (InputMismatchException e) {
				System.out.print("Bạn phải nhập 1 số.\nNhập lại: ");
				sc.nextLine();
			}
		}
		return n;
	}
	
	// Phương thức in ra 1 ma trận
	public static void display(double a[][]) {
		System.out.println();
		for(double b[] : a) {
			for(double c : b)
				System.out.printf("%6s", c);
			System.out.println();
		}
			
	}

	// Main
	public static void main(String[] args) {
		System.out.println("Nhân 2 ma trận");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		int n, m, h, k;
		System.out.println("Ma trận A");
		System.out.print("Nhập số hàng của ma trận A: ");
		n = int_input(sc);
		System.out.print("Nhập số cột của ma trận A: ");
		m = int_input(sc);
		double a[][] = new double[n][m];
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				System.out.print("Nhập A[" + i + "][" + j + "] = ");
				a[i - 1][j - 1] = double_input(sc);
			}
		System.out.println("Ma trận B");
		System.out.print("Nhập số hàng của ma trận B: ");
		h = int_input(sc);
		System.out.print("Nhập số cột của ma trận B: ");
		k = int_input(sc);
		double b[][] = new double[h][k];
		for (int i = 1; i <= h; i++)
			for (int j = 1; j <= k; j++) {
				System.out.print("Nhập B[" + i + "][" + j + "] = ");
				b[i - 1][j - 1] = double_input(sc);
			}
		System.out.println("Ma trận A:");
		display(a);
		System.out.println("Ma trận B:");
		display(b);
		System.out.println("-------------------------------------------------");
		if (m != h)
			System.out.println("Không thể nhân 2 ma trận");
		else {
			double c[][] = new double[n][k];
			System.out.println("Tích của 2 ma trận là C = A * B:");
			for(int i = 0; i < n; i ++)
				for(int j = 0; j < k; j ++) {
					c[i][j] = 0;
					for(int l = 0; l < m; l++)
						c[i][j] += a[i][l] * b[l][j];
				}
			display(c);
		}
	}
}
