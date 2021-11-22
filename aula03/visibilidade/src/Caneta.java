public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    private void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void escrever() {
        if (this.tampada) {
            System.out.println("Erro! Não posso escrever!");
        } else {
            System.out.println("Estou escrevendo!");
        }
    }

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
