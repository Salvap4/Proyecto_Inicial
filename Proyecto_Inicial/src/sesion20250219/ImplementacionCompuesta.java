package sesion20250219;

interface Hundible {
    void hundir();
}
interface Flotable {
    void flotar();
}
interface Permeable {
    void mojar();
}
interface Comestible {
    void comer();
}

abstract class Item {
    String nombre;
    int id;

    public Item (String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
}

class Piedra extends Item implements Hundible, Permeable {
    public Piedra(String nombre, int id) {
        super(nombre,id);
    }
    public void hundir(){
        System.out.println("La pieda se ha hundido");
    }
    public void mojar() {
        System.out.println("La piedra se ha mojado");
    }
}

class Cosa extends Item implements Flotable, Permeable, Comestible {
    public Cosa(String nombre, int id) {
        super(nombre, id);
    }
    public void flotar() {
        System.out.println("La cosa flota");
    }
    public void mojar() {
        System.out.println("La cosa está mojada");
    }
    public void comer(){
        System.out.println("La cosa estaba rica");
    }
}


public class ImplementacionCompuesta {
    public static void main(String[] args) {
        Piedra piedra = new Piedra("Piedra", 1);
        Cosa cosa = new Cosa("Cosa", 2);

        System.out.println("La "+piedra.getNombre()+" con id "+piedra.getId());
        piedra.hundir();
        piedra.mojar();

        System.out.println("La "+cosa.getNombre()+" con id "+cosa.getId());
        cosa.flotar();
        cosa.mojar();
        cosa.comer();
    }
}
