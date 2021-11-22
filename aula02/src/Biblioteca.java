public class Biblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Java: como programar";
        livro1.autor = "Paul Deitel";
        livro1.ano = 2007;
        livro1.preco = 50.00;
        livro1.emprestado = false;
        livro1.status();
        livro1.emprestar();
        livro1.status();
    }
}
