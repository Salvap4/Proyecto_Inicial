package sesion20250219;

// Asociacione es un "tiene un". Cuando una clase tiene un atributo que es de otra.
// por ejemplo, creo una clase "libro" que tendrá


class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrar() {
        System.out.println("El autor "+nombre+" es de "+nacionalidad+".");
    }
}

class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrar() {
        System.out.println("El libro "+titulo+" de "+autor.getNombre()+" tiene "+paginas+"páginas.");
    }

}

public class Asociacion {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Marquez", "Colombia");
        Autor autor2 = new Autor("Mario Vargas Llosa", "no sé");

        Libro libro1 = new Libro("cien años de soledad", autor1, 500);
        Libro libro2 = new Libro("La ciudad y los perros", autor2, 300);

        autor1.mostrar();
        autor2.mostrar();
        libro1.mostrar();
        libro2.mostrar();
    }
}
