package Funcionarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Singleton tem um construtor privado para evitar que outras classes criem uma nova instância. 
//A única maneira de obter uma instância de Singleton é através do método getInstancia(), que cria uma nova instância apenas se ainda não existir uma

public class FuncionarioSingleton {
    private static FuncionarioSingleton instancia;
    private List<Funcionario> funcionarios;

    private FuncionarioSingleton() {
        funcionarios = new ArrayList<>();

    }

    public static FuncionarioSingleton getInstancia() {
        if (instancia == null) {
             instancia = new FuncionarioSingleton();
        }
        return instancia;
    }

    public List<Funcionario> getFuncionarios() {
        System.out.println("Lista de Funcionarios:");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id) {
        Iterator<Funcionario> iterator = funcionarios.iterator();

        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();

            if (funcionario.getId() == id) {
                iterator.remove();
                System.out.println("Funcionario ID: " +id + " foi excluido da base.");
                break;
            }
        }
    }
    



}
