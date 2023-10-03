package Livros;
import java.util.ArrayList;
import java.util.List;

public class LivroController {


    private List<Livro> livros;

    public LivroController() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro Criado com Sucesso");
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
        System.out.println("Livro excluido com Sucesso");
    }


}


