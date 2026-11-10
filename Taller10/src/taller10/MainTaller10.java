package taller10;

public class MainTaller10 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente();
        empleado.trabajar();
        gerente.trabajar();

        System.out.println();

        Persona[] personas = {new Persona(), new Estudiante(), new Profesor()};
        for (Persona persona : personas) {
            persona.presentarse();
        }

        System.out.println();

        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();
        vehiculo.moverse();
        bicicleta.moverse();
    }
}
