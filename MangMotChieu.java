package Function_Oriented;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai10 {
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
	public static void display(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "   ");
		System.out.println();
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

	// Main
	public static void main(String[] args) {
		System.out.println("Tìm tất cả các số nguyên tố trong 1 mảng nguyên đặt lên đầu và có sắp xếp");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = size_input(sc);
		int a[] = new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.print("Nhập phần tử thứ " + i + " của mảng: ");
			a[i - 1] = ele_input(sc);
		}
		System.out.println("Mảng đã nhập là:");
		display(a, n);
		sc.close();
		System.out.println("-------------------------------------------------");
		int c = 0;
		for (int i = 0; i < n; i++) { // Đưa các số nguyên tố lên đầu mảng
			if (prime_num(a[i])) {
				int temp = a[i];
				for (int j = i; j > c; j--)
					a[j] = a[j - 1];
				a[c] = temp;
				c++;
			}
		}
		for (int i = 0; i < c - 1; i++) // Sắp xếp các số nguyên tố tăng dần
			for (int j = i + 1; j < c; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		System.out.println("Mảng sau khi sắp xếp là:");
		display(a, n);
	}
}
