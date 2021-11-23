public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        c1.setCor("Vermelha");
        c1.setTampada(true);
        c1.getModelo();
        c1.getPonta();
        c1.getCor();
        c1.getTampada();
    }
}
