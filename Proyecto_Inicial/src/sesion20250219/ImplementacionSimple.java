package sesion20250219;

interface Sonido {
    void hacerSonido();
}

interface Subir {
    void subirArbol();
}

class Gato implements Sonido, Subir {
    public void hacerSonido() {
        System.out.println("Miau");
    }
    public void subirArbol() {
        System.out.println("Sube árboles.");
    }
}

class Perro implements Sonido {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}


public class ImplementacionSimple {
    public static void main(String[] args) {
        Sonido garfield = new Gato();
        Sonido patan = new Perro();

        System.out.print("Garfield hace ");
        garfield.hacerSonido();

        // hacemos un casting para cambiar gato de "sonido" a "subir"
        if (garfield instanceof Subir) {
            ((Subir) garfield).subirArbol();
        }
        garfield.hacerSonido();

        System.out.print("Patan hace ");
        patan.hacerSonido();
    }
}
