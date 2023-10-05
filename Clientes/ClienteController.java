package Clientes;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private final List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso");
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes); // Retorna uma cópia da lista para evitar alterações externas.
    }

    public void atualizarCliente(Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == clienteAtualizado.getId()) {
                clientes.set(i, clienteAtualizado); // Substitui o cliente antigo pelo atualizado.
                System.out.println("Cliente atualizado com sucesso");
                break;
            }
        }
        System.out.println("Cliente não encontrado para atualização");
    }

    public void removerCliente(Cliente cliente) {
        if (clientes.remove(cliente)) {
            System.out.println("Cliente removido com sucesso");
        } else {
            System.out.println("Cliente não encontrado para remoção");
        }
    }

    public Cliente pesquisarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado.
    }
}

