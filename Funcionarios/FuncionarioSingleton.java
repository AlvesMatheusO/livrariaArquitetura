package Funcionarios;
import java.util.ArrayList;
import java.util.List;

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

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario.getId());
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }


}
