package tuan3;

import java.util.Scanner;
public class XoaKhoangTrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ");
        String st = sc.nextLine();
        sc.close();
        st = st.trim();
        String firstName = st.substring(0,1);
        String remainName = st.substring(1, st.length());
        firstName = firstName.toUpperCase();

        System.out.println("In ra chuoi sau khi xoa: " + firstName + remainName);

    }
}
