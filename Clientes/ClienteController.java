package Clientes;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            
            System.out.println(cliente.getNome());
        }
        return clientes;
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
    }

    public void removerCliente(int id) {
        Iterator<Cliente> iterator = clientes.iterator();

        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getId() == id) {
                iterator.remove();
                System.out.println("Cliente "+ cliente.getNome() + " excluido com sucesso");
                break;
            }
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

