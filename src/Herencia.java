public class Herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(25);
        cliente.setTelefono(5566789);
        cliente.setCredito(500000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Pedro");
        trabajador.setEdad(30);
        trabajador.setTelefono(5566789);
        trabajador.setSalario(50000);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}
