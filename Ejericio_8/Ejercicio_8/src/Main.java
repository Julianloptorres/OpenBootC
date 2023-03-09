public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        persona.setNombre("Julián");
        //System.out.println("Mi nombres es: " + persona.getNombre());

        persona.setEdad(31);
        //System.out.println("tengo " + persona.getEdad() + " años.");

        persona.setTelefono(5648975);
        //System.out.println("Mi número de teléfono es: " + persona.getTelefono());

        Cliente cliente = new Cliente();

        cliente.setNombre("Ana");
        cliente.setEdad(28);
        cliente.setTelefono(324654);
        cliente.setCredito(280.50);
        
        System.out.println("Mi nombre es " + cliente.getNombre() + ", tengo "
        + cliente.getEdad() +  " años. Mi número de teléfono es "+ cliente.getTelefono() + " y mi crédito es de " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        
        trabajador.setNombre("Carlos");
        trabajador.setEdad(25);
        trabajador.setSalario(2200.45);
        trabajador.setTelefono(65465423);
        
        System.out.println("Mi nombre es " + trabajador.getNombre() + ", tengo "
        + trabajador.getEdad() +  " años. Mi número de teléfono es "+ trabajador.getTelefono() + " y mi salario es de " + trabajador.getSalario());

    }
}
