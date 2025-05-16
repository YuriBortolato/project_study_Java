package controller;


import model.Cliente; import model.Emprestimo;
import java.util.ArrayList; import java.util.List;


public class ClienteController { private List<Cliente> clientes = new ArrayList<>();

public void adicionarCliente(String nome, String cpf) {
    clientes.add(new Cliente(nome, cpf));
}

public List<Cliente> listarClientes() {
    return clientes;
}

public Cliente buscarPorCpf(String cpf) {
    for (Cliente cliente : clientes) {
        if (cliente.getCpf().equals(cpf)) {
            return cliente;
        }
    }
    return null;
}

public void removerCliente(String cpf) {
    clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
}

public void registrarEmprestimo(String cpf, double capital, double taxa, int tempo) {
    Cliente cliente = buscarPorCpf(cpf);
    if (cliente != null) {
        cliente.setEmprestimo(new Emprestimo(capital, taxa, tempo));
    }
}

public void quitarEmprestimo(String cpf) {
    Cliente cliente = buscarPorCpf(cpf);
    if (cliente != null) {
        cliente.setEmprestimo(null);
    }
}

}