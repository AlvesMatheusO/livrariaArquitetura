import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Clientes.Cliente;
import Clientes.ClienteController;
import Funcionarios.Funcionario;
import Funcionarios.FuncionarioSingleton;
import Livros.Livro;
import Livros.LivroController;
import Livros.LivroDigital;
import Livros.LivroFactory;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        

        LivroController livroController = new LivroController();
        ClienteController clienteController = new ClienteController();


        // livroController.removerLivro(livro);


       Object[] funcoes = {"Livro", "Funcionario", "Cliente"};

       Object selectedvalue = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
       JOptionPane.INFORMATION_MESSAGE, null, funcoes, funcoes[0]);

       while (selectedvalue.equals("Livro")) {

        Object[] funcoesEscolhaLivro = {"Livro Fisico", "Livro Digital"};


        Object selectedvalueEscolha = JOptionPane.showInputDialog(null, "Escolha tipo Livro", "Biblioteca",
        JOptionPane.INFORMATION_MESSAGE, null, funcoesEscolhaLivro, funcoesEscolhaLivro[0]);

        while (selectedvalueEscolha.equals("Livro Fisico")) {
            //Livro Fisico
        
        Object[] funcoesLivro = {"Adicionar","Remover", "Listar", "Editar"};

       Object selectedvalueLivro = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
       JOptionPane.INFORMATION_MESSAGE, null, funcoesLivro, funcoesLivro[0]);

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

       } else if (selectedvalueLivro.equals("Editar")) {

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

        int option = JOptionPane.showConfirmDialog(null, 
        message, "Editar Livro", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            int idString = Integer.parseInt(id.getText());
            String tituloString = titulo.getText();
            String autorString = autor.getText();
            int dataString = Integer.parseInt(data.getText());

            Livro livro = new Livro(idString, tituloString, autorString, dataString); 
            livroController.atualizarLivro(livro);
            

            System.out.println("ID:" + idString);
            System.out.println("Titulo: " + tituloString);
            System.out.println("Autor: " + autorString);
            System.out.println("Data: " + dataString);

               
        }
            } else if (selectedvalueLivro.equals("Listar")) {

        livroController.listarLivros();
       
    }
      
        }

        while (selectedvalueEscolha.equals("Livro Digital")) {
            Object[] funcoesLivroDigital = {"Adicionar"};

            Object selectValueLivro = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
            JOptionPane.INFORMATION_MESSAGE, null, funcoesLivroDigital, funcoesEscolhaLivro[0]);


            if (selectValueLivro.equals("Adicionar")) {
                JTextField id = new JTextField();
                JTextField titulo = new JTextField();
                JTextField autor = new JTextField();
                JTextField anoPublicacao = new JTextField();
                JTextField formato = new JTextField();
                JTextField tamanhoArquivo = new JTextField();

                Object[] message = {
                    "id:", id,
                    "Titulo:", titulo,
                    "Autor:", autor,
                    "Data Publicação:", anoPublicacao,
                    "Formato:", formato,
                    "Tamanho do Arquivo:", tamanhoArquivo,
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Entrada", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                int idString = Integer.parseInt(id.getText());
                String tituloString = titulo.getText();
                String autorString = autor.getText();
                int dataString = Integer.parseInt(anoPublicacao.getText());
                String formatoString = formato.getText();
                double tamanhoString = Double.parseDouble(tamanhoArquivo.getText());


                //Adicionar Livro Digital

                LivroDigital livroDigital = new LivroDigital.Builder(idString)
                .titulo(tituloString)
                .autor(autorString)
                .anoPublicacao(dataString)
                .formato(formatoString)
                .tamanhoArquivo(tamanhoString)
                .build();

                livroController.adicionarLivro(livroDigital);
                livroController.listarLivros();

            }
        }

            
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

    while (selectedvalue.equals("Cliente")) {

          Object[] funcoesCliente = {"Adicionar","Remover", "Listar", "Editar"};
        
        Object selectedvalueCliente = JOptionPane.showInputDialog(null, "Escolha uma função:", "Biblioteca", 
        JOptionPane.INFORMATION_MESSAGE, null, funcoesCliente, funcoesCliente[0]);

        if (selectedvalueCliente.equals("Adicionar")) {

            JTextField id = new JTextField();
            JTextField nome = new JTextField();
            JTextField email = new JTextField();
            JTextField endereco = new JTextField();
            JTextField telefone = new JTextField();
            
            Object[] message = {
                "id:", id,
                "Nome:", nome,
                "Email:", email,
                "Endereço:", endereco,
                "Telefone:", telefone,
            
            };

              int option = JOptionPane.showConfirmDialog(null, message, "Entrada", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                int idString = Integer.parseInt(id.getText());
                String nomeString = nome.getText();
                String emailString = email.getText();
                String enderecoString = endereco.getText();
                String telefoneString = telefone.getText();

                
                clienteController.adicionarCliente(new Cliente(idString, nomeString, emailString, enderecoString, telefoneString));
                clienteController.listarClientes();

                }


        } else if (selectedvalueCliente.equals("Remover")) {

            JTextField id = new JTextField();

            Object[] message = {
            "id:", id,
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Digite o ID do Cliente para exclusão", JOptionPane.OK_CANCEL_OPTION);

            if (option == JOptionPane.OK_OPTION) {
            int idString = Integer.parseInt(id.getText());

            clienteController.removerCliente(idString);

            }
        } else if(selectedvalueCliente.equals("Listar")) {
            clienteController.listarClientes();

        } else if (selectedvalueCliente.equals("Editar")) {

            JTextField id = new JTextField();
            JTextField nome = new JTextField();
            JTextField email = new JTextField();
            JTextField endereco = new JTextField();
            JTextField telefone = new JTextField();

            Object[] message = {
            "id:", id,
            "Nome:", nome,
            "Email:", email,
            "Endereço:", endereco,
            "Telefone:", telefone,
        };

        int option = JOptionPane.showConfirmDialog(null, 
        message, "Editar Funcionario", JOptionPane.OK_CANCEL_OPTION);


        if (option == JOptionPane.OK_OPTION) {
            
            int idString = Integer.parseInt(id.getText());
            String nomeString = nome.getText();
            String emailString = email.getText();
            String enderecoString = endereco.getText();
            String telefoneString = telefone.getText();
            
            Cliente cliente = new Cliente(idString, nomeString, emailString, enderecoString, telefoneString);

            clienteController.atualizarCliente(cliente);
            clienteController.listarClientes();
        }
           
            
        }

        

        
        }   
    }
}

