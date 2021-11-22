public class App {
    public static void main(String[] args) throws Exception {
      Caneta c1 = new Caneta();
      c1.modelo = "Bic";
      c1.cor = "Azul";
      c1.ponta = 0.5f;
      c1.destampar();
      c1.carga = 80;
      c1.status();
      c1.rabiscar();

      Caneta c2 = new Caneta();
      c2.modelo = "Mont Black";
      c2.cor = "Preto";
      c2.ponta = 0.7f;
      c2.destampar();
      c2.carga = 50;
      c2.status();
      c2.rabiscar();

      Computador c3 = new Computador();
      c3.modelo = "Macbook Pro";
      c3.marca = "Apple";
      c3.memoria = 32;
      c3.processador = "Intel Core i7";
      c3.ano = 2019;
      c3.preco = 11299.99;
      c3.ligar();
      c3.status();

      c3.desligar();
    }
}
