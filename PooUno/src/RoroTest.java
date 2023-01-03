public class RoroTest {

  public static void main(String[] args) {
    Cliente roro = new Cliente();
    roro.setNombre("Rodolfo");
    roro.setTelefono("5555555555");

    Anexos falta = new Anexos();
    falta.setDireccion("av siempre viva");
    falta.setSexo("men");

    System.out.println("El nombre del cliente es: "+ roro.getNombre());
    System.out.println("telefono es: " + roro.getTelefono());

    System.out.println("La direccion es: " + falta.getDireccion());
    System.out.println("El sexo es: " + falta.getSexo());

    System.out.println(roro);
    System.out.println(falta);
  }
}
