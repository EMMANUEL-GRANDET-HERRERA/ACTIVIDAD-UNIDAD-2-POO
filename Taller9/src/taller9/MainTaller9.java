package taller9;

public class MainTaller9 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 28, "Desarrollo");
        empleado.mostrarDetalles();

        System.out.println();

        Pez pez = new Pez("Pez", "Agua dulce");
        pez.mostrarEspecie();
    }
}
