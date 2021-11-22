public class Carro {
  String marca;
  String modelo;
  int ano;
  String cor;
  String placa;
  int velocidade;
  int marcha;
  int marchaMaxima;
  int marchaMinima;

  Boolean ligar() {
    return true;
  }

  Boolean desligar() {
    return false;
  }

  void acelerar() {
    velocidade += 10;
  }

  void frear() {
    velocidade -= 10;
  }

  void trocarMarcha(int marcha) {
    if (marcha > marchaMaxima) {
      marcha = marchaMaxima;
    } else if (marcha < marchaMinima) {
      marcha = marchaMinima;
    }
    this.marcha = marcha;
  }

  void imprimir() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
    System.out.println("Placa: " + placa);
    System.out.println("Velocidade: " + velocidade);
    System.out.println("Marcha: " + marcha);
  }
}
