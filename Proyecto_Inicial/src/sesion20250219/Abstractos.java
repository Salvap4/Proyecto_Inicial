package sesion20250219;

abstract class Empleado {
    // Quiero que todos los empleados tengan un nnombre, un salario y un método que resuma esta información
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void resumen();

}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void resumen() {
        System.out.println("El Gerente "+nombre+" cobra "+salario+"€ como jefe del departamento de "+departamento+".");
    }
}

class Programador extends Empleado {
    protected String lenguaje;

    public Programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    public final void resumen() {
        System.out.println("El programador "+nombre+" cobra "+salario+"€ por programar con "+lenguaje+".");
    }
}

class Junior extends Programador{
    private int experiencia;

    public Junior(String nombre, double salario, String lenguaje, int experiencia) {
        super(nombre, salario, lenguaje);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // No podemos usar "RESUMEN" porque ya está definido en la clase padre como "FINAL"

    public void tiempoDeEmpleo() {
        System.out.println("El programador "+nombre
                +" lleva "+experiencia+" años programando en "+lenguaje+".");
    }
}

public class Abstractos {

    public void main(String[] args) {
        Gerente ana = new Gerente("Ana", 5000, "IT");
        Programador juan = new Programador("Juan", 2500, "Java");
        Junior pedro = new Junior("Pedro", 1500, "Python", 2);
        ana.resumen();
        juan.resumen();
        pedro.tiempoDeEmpleo();
    }
}
