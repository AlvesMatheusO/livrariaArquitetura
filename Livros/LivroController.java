package Livros;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



public class LivroController {


    private List<Livro> livros;

    public LivroController() {
        this.livros = new ArrayList<>();
    }

    public void listarLivros() {
        System.out.println("Lista de livros:");
        for (Livro livro : livros) {
            
            System.out.println(livro.getTitulo());
        }

    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro Criado com Sucesso");
    }

    public void removerLivro(int id) {
    
        Iterator<Livro> iterator = livros.iterator();

        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getId() == id) {
                iterator.remove();
                System.out.println("Livro "+ livro.getTitulo() + " excluido com sucesso");
                break;
            }

        }
    }


}


