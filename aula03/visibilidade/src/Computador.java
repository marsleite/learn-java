public class Computador {
    public String modelo;
    public String cor;
    public int ano;
    public float preco;
    private boolean ligado;
    protected int memoria;

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void reiniciar() {
        if (this.ligado) {
            this.ligado = false;
            this.ligado = true;
        }
    }
}
