package sesion20250109;

public class EjemploFunciones03 {

    public static void main(String[] args) {
        System.out.println(mayor(3,8));
    }
    
    public static int mayor(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }

    public static int mayor(int a, int b) {
        if (a >= b) return a;
        return b;
    }
}
