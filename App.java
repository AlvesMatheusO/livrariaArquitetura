import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Livros.Livro;
import Livros.LivroController;
import Livros.LivroFactory;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        

        LivroController livroController = new LivroController();


        // livroController.removerLivro(livro);


       Object[] funcoes = {"Funcionario","Livro"};

       Object selectedvalue = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
       JOptionPane.INFORMATION_MESSAGE, null, funcoes, funcoes[0]);

       if (selectedvalue.equals("Livro")) {
        
        Object[] funcoesLivro = {"Adicionar","Remover"};

       Object selectedvalueLivro = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
       JOptionPane.INFORMATION_MESSAGE, null, funcoesLivro, funcoes[0]);

       if (selectedvalueLivro.equals("Adicionar")) {
        JTextField id = new JTextField();
        JTextField titulo = new JTextField();
        JTextField autor = new JTextField();
        JTextField data = new JTextField();

        Object[] message = {
            "id:", id,
            "Titulo:", titulo,
            "Autor:", autor,
            "Data Publicação:", data,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Entrada", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            int idString = Integer.parseInt(id.getText());
            String tituloString = titulo.getText();
            String autorString = autor.getText();
            int dataString = Integer.parseInt(data.getText());

            Livro livro = LivroFactory.criarLivro(idString, tituloString, autorString, dataString);
            livroController.adicionarLivro(livro);

            System.out.println("ID:" + idString);
            System.out.println("Titulo: " + tituloString);
            System.out.println("Autor: " + autorString);
            System.out.println("Data: " + dataString);
        } 
        
       } else if (selectedvalueLivro.equals("Remover")) {

         Livro livro = LivroFactory.criarLivro(1,"tituloString","autorString" , 2002);
            livroController.adicionarLivro(livro);
            livroController.removerLivro(livro);
        
       }
       }

    }
    }

