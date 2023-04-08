package LearnJAVA.OOP_JAVA.JavaCore;

public class Dequy {
    static int Acker(int m, int n){
        if(m == 0)
             return n +1;
        else if(n == 0)
            return Acker(m - 1, 1);
        else 
            return Acker(m-1, Acker(m, n-1));
    }
    public static void main(String[] args) {
        System.out.println("De quy: " + Acker(1, 2));
    }
}
