public class PEncapsula {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();
    Cliente cliente = new Cliente();
    cliente.setNombre("Rodolfo");
    cliente.setDocumento("12335fdgd");
    cliente.setTelefono("55555555555");

    cuenta.setTitular(cliente);

    System.out.println(cliente.getNombre());
    System.out.println(cuenta.getTitular().getNombre());
  }
}
