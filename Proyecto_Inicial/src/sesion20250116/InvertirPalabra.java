package sesion20250116;

public class InvertirPalabra {

    // Invertir una cadena
    // Escribe una función recursiva que invierta una cadena de texto.
    // Ejemplo: invertir("recursivo") → "ovisrucer".

    public static void main(String[] args) {
        System.out.println(invertir("recursivo"));
    }

    public static String invertir(String palabra) {
        if (palabra.isEmpty()) return palabra; // ya está vacía
        // System.out.println("por ahora tengo esto: "+palabra.substring(1) + palabra.charAt(0));
        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
}
