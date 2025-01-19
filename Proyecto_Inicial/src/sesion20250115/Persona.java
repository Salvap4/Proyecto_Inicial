package sesion20250115;

public class Persona {

    public static void main(String[] args) {
        System.out.println(sumar(1,2,3));
        System.out.println(sumar(1,2,3,4));
    }

    public static int sumar(int... numeros) { // esti es lo de usar varargs
        int suma = 0;
        for (int num : numeros) {
            suma = suma + num;
        }
        return suma;
    }
}
