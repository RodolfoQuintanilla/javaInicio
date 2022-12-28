public class PruebaMetodos {

  public static void main(String[] args) {
    Cuenta MiCuenta = new Cuenta();
    MiCuenta.saldo = 300;
    MiCuenta.depositar(200);

    System.out.println(MiCuenta.saldo);

    MiCuenta.retirar(100);
    System.out.println("Mi cuentaq primero: " + MiCuenta.saldo);

    Cuenta cuentaDeJimena = new Cuenta();
    cuentaDeJimena.depositar(1000);
    boolean puedeTraferir = cuentaDeJimena.trasFerir(400, MiCuenta);

    cuentaDeJimena.trasFerir(400, MiCuenta);

    if (puedeTraferir) {
      System.out.println("trasferencia es exitosa");
    }

    System.out.println("Jimena: " + cuentaDeJimena.saldo);
    System.out.println("Mi cuenta " + MiCuenta.saldo);
  }
}
