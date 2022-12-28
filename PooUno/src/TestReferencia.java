public class TestReferencia {

  public static void main(String[] args) {
    Cuenta primerCuenta = new Cuenta();
    primerCuenta.saldo = 200;

    Cuenta segundaCuenta = new Cuenta();
    segundaCuenta.saldo = 110;

    System.out.println("Saldo Primera " + "Cuenta: " + primerCuenta.saldo);
    System.out.println("Saldo Segunda " + "Cuenta: " + segundaCuenta.saldo);

    segundaCuenta.saldo += 400;


    System.out.println("Saldo Primera " + "Cuenta: " + primerCuenta.saldo);
    System.out.println("Saldo Segunda " + "Cuenta: " + segundaCuenta.saldo);

    if(primerCuenta == segundaCuenta){
        System.out.println("son las mismas");
    }else{
        System.out.println("Son diferentes");
    }
  }
}
