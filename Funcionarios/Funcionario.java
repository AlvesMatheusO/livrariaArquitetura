package Funcionarios;

public class Funcionario {
    private final int id;
    private String nome;

    public Funcionario (int id, String  nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}


