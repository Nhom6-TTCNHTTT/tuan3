package tuan3;

import java.util.Scanner;
public class StringNguoc {
    public static void main(String[] args) {
        String s = "ABC";
        char[] ch = s.toCharArray();
        String text = "";
        for(int i=ch.length-1;i>=0;i--){
            text = text + ch[i];
        }
        System.out.println(text);
        // String reverseString(String s) {
        //     if(s.length() == 0)
        //       return " ";
        //     return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
        //   }
        //   public static void main(String[] args) {
        //     ReverseStringRecursion r = new ReverseStringRecursion();
        //     String s = "Java tutorial";
        //     System.out.println("Original string: " + s);
        //     System.out.println("Reversed string: " + r.reverseString(s));
        //   }
    }
}
