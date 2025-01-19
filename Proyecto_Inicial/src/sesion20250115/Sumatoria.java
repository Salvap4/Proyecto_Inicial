package sesion20250115;

public class Sumatoria {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("La suma de los números desde 0 hasta "+n+" es: "+sumar(n));
    }

    public static int sumar(int n) {
        if (n<=0) return 0;
        return n+sumar(n-1);
    }
}
