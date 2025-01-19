package sesion20250116;

public class ContadorDeCeros {

    // Conteo de ceros en un número
    // Escribe una función recursiva que cuente cuántos ceros tiene un número.
    // Ejemplo: contarCeros(102030) = 3.

    public static void main(String[] args) {
        System.out.println("El número 102030 tiene "+contarCeros(102030)+ " ceros");
    }

    public static int contarCeros(int n) {
        if (n<10) return (n==0)? 1 : 0;
        return ((n%10==0)? 1 : 0) + contarCeros(n/10);
    }
}
