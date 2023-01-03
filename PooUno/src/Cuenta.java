public class Cuenta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular = new Cliente();
  private Anexos docs = new Anexos();
  private static int total = 0; // ==>

  //2
  /* 
 public Cuenta(){
  } */

  //1 ==> al crear un constructor con paramrtros java ya no crea automaticamente uno
  public Cuenta(int agenciar) {
    if (agenciar <= 0) {
      System.err.println("No Se Permite 0");
      this.agencia = 1;
    } else {
      this.agencia = agenciar;
    }
    total++;
    System.out.println("Aqui se crea nueva cuenta: " + total);
  }

  //Primer metodo ==> No retorna Valor
  public void depositar(double valor) {
    this.saldo += valor;
  }

  //Metod Si retorna valor
  public boolean retirar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public boolean trasFerir(double valor, Cuenta cuenta) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      /*  cuenta.saldo = cuenta.saldo + valor; */
      cuenta.depositar(valor);
      return true;
    }
    return false;
  }

  public void deposita(double valor) {
    this.saldo += valor;
  }

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setAgencia(int agencia) {
    if (agencia > 0) {
      this.agencia = agencia;
    }
  }

  public int getAgencia() {
    return agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotal() {
    return Cuenta.total;
  }
}
