public class PruebaConstructor {
//Constructor obliga a dar cuenta 
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta(565);
    Cuenta cuenta2 = new Cuenta(33);
    Cuenta cuenta3 = new Cuenta(323);
    /* cuenta.setAgencia(-4); */
    System.out.println(Cuenta.getTotal());
  }
}
