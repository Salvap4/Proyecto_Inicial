package sesion20250122;

/**
 * La clase Coche representa un coche con atributos de marca, modelo y velocidad.
 * Proporciona métodos para obtener y modificar estos atributos, así como para
 * acelerar y frenar el coche.
 * 
 * Atributos:
 * - marca: La marca del coche.
 * - modelo: El modelo del coche.
 * - velocidad: La velocidad actual del coche en km/h.
 * 
 * Métodos:
 * - Coche(String marca, String modelo): Constructor que inicializa un coche con la marca y modelo especificados, y velocidad inicial de 0 km/h.
 * - getMarca(): Devuelve la marca del coche.
 * - getModelo(): Devuelve el modelo del coche.
 * - getVelocidad(): Devuelve la velocidad actual del coche.
 * - setMarca(String marca): Establece la marca del coche.
 * - setModelo(String modelo): Establece el modelo del coche.
 * - setVelocidad(int velocidad): Establece la velocidad del coche, siempre que sea un valor positivo.
 * - acelerar(int incremento): Aumenta la velocidad del coche en la cantidad especificada, siempre que el incremento sea positivo.
 * - frenar(int decremento): Reduce la velocidad del coche en la cantidad especificada, siempre que el decremento sea positivo y no resulte en una velocidad negativa.
 * 
 * Ejemplo de uso:
 * <pre>
 * {@code
 * Coche miCoche = new Coche("KIA", "Ceed");
 * System.out.println("Mi coche es un " + miCoche.getMarca() + " " + miCoche.getModelo() + " que ahora va a " + miCoche.getVelocidad() + " km/h");
 * miCoche.setVelocidad(100);
 * System.out.println("Mi coche va a " + miCoche.getVelocidad() + " km/h");
 * miCoche.frenar(40);
 * }
 * </pre>
 */
public class Coche {

    // Lo primero que solemos hacer es declarar qué atributos va a usar nuestra clase.
    private String marca;
    private String modelo;
    private int velocidad;

    // Ahora voy a crear el CONSTRUCTOR de la clase. ESTO es lo que de verdad me permite crear objetos
    public Coche(String marca, String modelo) { // Vamos a suponer que, por defecto, el coche está quieto.
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    // Los getters nos ayudan a obtener
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    // Setters, ayudan a modificar el valor en memoria de los atributos de un objeto
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setVelocidad(int velocidad) {
        if(velocidad>0) {this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad no puede ser negativa");
        }
        
    }

    public void acelerar(int incremento) {
        if(incremento>0) {
            velocidad += incremento;
            System.out.println("El coche ahora va más rápido. Velocidad actual: "+velocidad+" km/h");
        } else {
            System.out.println("El incremento debe ser positivo, por lo que no ha cambiado la velocidad al intentar acelerar");
        }
    }

    /**
     * Reduce la velocidad del coche en una cantidad específica
     * @param decremento La cantidad de km/h a reducir (debe ser un número positivo)
     */
    public void frenar(int decremento) {
        if(decremento>0 && velocidad - decremento >= 0) {
            velocidad -= decremento;
            System.out.println("El coche ahora va más lento. Velocidad actual: "+velocidad+" km/h");
        } else if(decremento>0) {
            System.out.println("La velocidad no puede quedar en números negativos");
        }else {
            System.out.println("El decremento debe ser positivo, por lo que no ha cambiado la velocidad al intentar frenar");
        }
    }

    public static void main(String[] args) {
        //Crearemos un coche de ejemplo
        Coche miCoche = new Coche("KIA", "Ceed");
        System.out.println("Mi coche es un "+miCoche.getMarca()+" "+miCoche.getModelo()+" que ahora va a "+miCoche.getVelocidad()+" km/h");
        miCoche.setVelocidad(100);
        System.out.println("Mi coche va a "+miCoche.getVelocidad()+" km/h");
        miCoche.frenar(40);
    }
}
