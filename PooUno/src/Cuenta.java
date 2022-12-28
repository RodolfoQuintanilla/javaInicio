public class Cuenta {
  double saldo;
  int agencia;
  int numero;
  String titular;

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
}
