package entregas.actividad_6;


/**
 * La clase Fraccion representa una fracción matemática con un numerador y un denominador.
 * Proporciona métodos para crear y manipular fracciones.
 * 
 * Atributos:
 * - numerador: el numerador de la fracción.
 * - denominador: el denominador de la fracción.
 * 
 * Constructores:
 * - Fraccion(): crea una fracción con numerador 1 y denominador 0.
 * - Fraccion(int numerador, int denominador): crea una fracción con el numerador y denominador dados, 
 *   imprime un mensaje de error si el denominador es 0.
 * - Fraccion(int numerador): crea una fracción con el numerador dado y denominador 1.
 * 
 * Métodos:
 * - int getNumerador(): devuelve el valor del numerador.
 * - int getDenominador(): devuelve el valor del denominador.
 * - void setNumerador(int numerador): establece el valor del numerador.
 * - void setDenominador(int denominador): establece el valor del denominador, imprime un mensaje si el denominador es 0.
 * - String toString(): devuelve una representación en cadena de la fracción en formato "numerador/denominador".
 * 
 * Ejemplo de uso:
 * - En el método main se crean tres fracciones de ejemplo y se muestran sus valores.
 * - Se actualiza el denominador de una fracción utilizando el método setDenominador.
 */

public class Fraccion {

    // Atributos
    private int numerador;
    private int denominador;

    // Constructores
    public Fraccion() {
        numerador = 1;
        denominador = 0;
    }

    public Fraccion(int numerador, int denominador) {
        if (denominador != 0) {
            this.numerador = numerador;
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0");
        }
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        denominador = 1;
    }

    // Métodos
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public void setDenominador(int denominador) {
        if(denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0");
        }
    }

    public String toString() {
        return (numerador+"/"+denominador);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        //Crearemos una fracción de ejemplo
        Fraccion miFraccion1 = new Fraccion();
        Fraccion miFraccion2 = new Fraccion(9, 4);
        Fraccion miFraccion3 = new Fraccion(7);
        System.out.println("miFraccion1: "+miFraccion1.toString());
        System.out.println("miFraccion2: "+miFraccion2.toString());
        System.out.println("miFraccion3: "+miFraccion3.toString());

        System.out.println("Denominador de miFraccion2: "+miFraccion2.getDenominador());
        System.out.println("Actualizamos el denominador de \"miFraccion2\" a 8 usando el método setDenominador");
        miFraccion2.setDenominador(8);
        System.out.println("miFraccion2: "+miFraccion2.toString());
    }
}