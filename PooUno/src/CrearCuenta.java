public class CrearCuenta {
    public static void main(String[] args) {
        //variable           = Valor
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo =1000;

       System.out.println(primeraCuenta.saldo);

       Cuenta segundaCuenta=new Cuenta();
       segundaCuenta.saldo=5000;

       System.out.println(segundaCuenta.agencia);
    }
}
