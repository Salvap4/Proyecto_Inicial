package sesion20250115;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de "+n+" es: "+factorial(n));
    }

    public static int factorial(int n) {
        if (n<0) return -1;
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}