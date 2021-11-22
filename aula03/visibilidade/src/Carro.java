public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public float preco;
    private boolean ligado;
    protected boolean alarme;

    protected void ligar() {
        this.ligado = true;
    }

    protected void desligar() {
        this.ligado = false;
    }
}
