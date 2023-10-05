import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Funcionarios.Funcionario;
import Funcionarios.FuncionarioSingleton;
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


       Object[] funcoes = {"Livro", "Funcionario"};

       Object selectedvalue = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
       JOptionPane.INFORMATION_MESSAGE, null, funcoes, funcoes[0]);

       while (selectedvalue.equals("Livro")) {
        
        Object[] funcoesLivro = {"Adicionar","Remover", "Listar"};

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

            livroController.listarLivros();
        } 
        
       } else if (selectedvalueLivro.equals("Remover")) {

        JTextField id = new JTextField();

        Object[] message = {
            "id:", id,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Digite o ID para exclusão", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            int idString = Integer.parseInt(id.getText());

        livroController.removerLivro(idString);
        livroController.listarLivros();
        
        }

       } else if (selectedvalue.equals("Listar")) {

        livroController.listarLivros();
       }
       }

       while (selectedvalue.equals("Funcionario")) {
        
         Object[] funcoesFuncionario = {"Adicionar","Remover", "Listar"};
        
        Object selectedvalueFuncionario = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
        JOptionPane.INFORMATION_MESSAGE, null, funcoesFuncionario, funcoes[0]);

        if (selectedvalueFuncionario.equals("Adicionar")) {
            JTextField id = new JTextField();
            JTextField nome = new JTextField();
            
            Object[] message = {
                "ID: ", id,
                "Nome: ", nome,

            };

            int option = JOptionPane.showConfirmDialog(null, message, "Entrada", JOptionPane.OK_CANCEL_OPTION);
        
            if (option == JOptionPane.OK_OPTION) {
                int idString = Integer.parseInt(id.getText());
                String nomeString = nome.getText();

                FuncionarioSingleton funcionarioSingleton = FuncionarioSingleton.getInstancia();
                funcionarioSingleton.adicionarFuncionario(new Funcionario(idString, nomeString));

                funcionarioSingleton.getFuncionarios();
            }
        
        } else if (selectedvalueFuncionario.equals("Remover")) {

            JTextField id = new JTextField();

            Object[] message = {
            "id:", id,
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Digite o ID para exclusão", JOptionPane.OK_CANCEL_OPTION);

            if (option == JOptionPane.OK_OPTION) {
            int idString = Integer.parseInt(id.getText());


            FuncionarioSingleton funcionarioSingleton = FuncionarioSingleton.getInstancia();
            funcionarioSingleton.removerFuncionario(idString);

            funcionarioSingleton.getFuncionarios();
            
        }


       }

       else if (selectedvalueFuncionario.equals("Listar")) {
            FuncionarioSingleton funcionarioSingleton = FuncionarioSingleton.getInstancia();
            funcionarioSingleton.getFuncionarios();
       }

    }
}
}

