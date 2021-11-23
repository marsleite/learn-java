public class Monitor {
  public String marca;
  public String modelo;
  public int tamanho;
  public int resolucao;
  public int refreshRate;
  public String cor;

  public void getMarca() {
    System.out.println("Marca: " + this.marca);
  }

  public String setMarca(String m) {
    return this.marca = m;
  }

  public String getModelo() {
    System.out.println("Modelo: " + this.modelo);
    return this.modelo;
  }

  public String setModelo(String m) {
    return this.modelo = m;
  }

  public int getTamanho() {
    System.out.println("Tamanho: " + this.tamanho);
    return this.tamanho;
  }

  public int setTamanho(int t) {
    return this.tamanho = t;
  }

  public int getResolucao() {
    return this.resolucao;
  }

  public int setResolucao(int r) {
    return this.resolucao = r;
  }

  public int getRefreshRate() {
    return this.refreshRate;
  }

  public int setRefreshRate(int r) {
    return this.refreshRate = r;
  }

  public String getCor() {
    return this.cor;
  }

  public String setCor(String c) {
    return this.cor = c;
  }
}
