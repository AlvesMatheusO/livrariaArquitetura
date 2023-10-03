package Livros;

public class LivroFactory {
    public static Livro criarLivro(int id, String titulo, String autor, int anoPublicacao) {
        return new Livro(id, titulo, autor, anoPublicacao);
    }
}