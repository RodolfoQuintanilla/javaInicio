public class TestReferencia2 {

  public static void main(String[] args) {
    Cliente diego = new Cliente();
    diego.nombre = "Diego";
    diego.documento = "jdsñofhijvsv2564";
    diego.telefono = "9955445144454";

    Cuenta cuentaDeDiego = new Cuenta();
   // cuentaDeDiego.agencia = 1;
    cuentaDeDiego.titular = diego;

    System.out.println(cuentaDeDiego.titular.documento);
    System.out.println(cuentaDeDiego.titular);
  }
}
