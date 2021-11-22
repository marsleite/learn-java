public class Computador {
    String marca;
    String modelo;
    String processador;
    int memoria;
    int ano;
    double preco;
    boolean ligado;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória: " + this.memoria);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);
        System.out.println("Ligado: " + this.ligado);
    }

    boolean ligar() {
        if (this.ligado) {
            System.out.println("O computador já está ligado!");
            return false;
        } else {
            System.out.println("Ligando o computador...");
            this.ligado = true;
            return true;
        }
    }
    
    boolean desligar() {
        if (this.ligado) {
            System.out.println("Desligando o computador...");
            this.ligado = false;
            return true;
        } else {
            System.out.println("O computador já está desligado!");
            return false;
        }
    }
}
