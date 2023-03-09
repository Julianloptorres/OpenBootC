public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        persona.setNombre("Julián");
        System.out.println("Mi nombres es: " + persona.getNombre());

        persona.setEdad(31);
        System.out.println("tengo " + persona.getEdad() + " años.");
        
        persona.setTelefono(5648975);
        System.out.println("Mi número de teléfono es: " + persona.getTelefono());
    }
}
