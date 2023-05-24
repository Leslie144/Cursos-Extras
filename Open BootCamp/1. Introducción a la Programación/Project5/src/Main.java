// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(30, "Juan", "123456789", 1000.0);
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(35, "María", "987654321", 2000.0);
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}