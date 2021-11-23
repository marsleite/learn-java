public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  private boolean tampada;

  public void getModelo() {
    System.out.println("Modelo: " + this.modelo);
  }

  public String setModelo(String m) {
    return this.modelo = m;
  }

  public void getCor() {
    System.out.println("Cor: " + this.cor);
  }

  public String setCor(String c) {
    return this.cor = c;
  }

  public void getPonta() {
    System.out.println("Ponta: " + this.ponta);
  }

  public float setPonta(float p) {
    return this.ponta = p;
  }

  public boolean setTampada(boolean t) {
    if (t == false) {
      return this.tampada = true;
    } else {
      return this.tampada = false;
    }
  }

  public boolean getTampada() {
    return this.tampada;
  }
}
