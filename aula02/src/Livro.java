public class Livro {
    String titulo;
    String autor;
    int ano;
    double preco;
    boolean emprestado;

    void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);
        System.out.println("Emprestado: " + this.emprestado);
    }

    void emprestar() {
        this.emprestado = true;
    }

    void devolver() {
        this.emprestado = false;
    }
}
