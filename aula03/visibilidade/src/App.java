public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampada = true;
        c1.status();
    }
}
