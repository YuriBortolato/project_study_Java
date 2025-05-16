package view;

import controller.ClienteController; import model.Cliente;

import java.util.Scanner;

public class MenuView { private ClienteController controller = new ClienteController(); private Scanner scanner = new Scanner(System.in);

public void exibirMenu() {
    int opcao;
    do {
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Listar clientes");
        System.out.println("3 - Remover cliente");
        System.out.println("4 - Registrar empréstimo");
        System.out.println("5 - Calcular juros simples");
        System.out.println("6 - Calcular juros compostos");
        System.out.println("7 - Quitar empréstimo");
        System.out.println("0 - Sair");
        opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                controller.adicionarCliente(nome, cpf);
                break;
            case 2:
                for (Cliente c : controller.listarClientes()) {
                    System.out.println("Nome: " + c.getNome() + " | CPF: " + c.getCpf());
                }
                break;
            case 3:
                System.out.print("CPF do cliente: ");
                controller.removerCliente(scanner.nextLine());
                break;
            case 4:
                System.out.print("CPF do cliente: ");
                String cpfEmp = scanner.nextLine();
                System.out.print("Capital: ");
                double capital = Double.parseDouble(scanner.nextLine());
                System.out.print("Taxa (ex: 0.05): ");
                double taxa = Double.parseDouble(scanner.nextLine());
                System.out.print("Tempo: ");
                int tempo = Integer.parseInt(scanner.nextLine());
                controller.registrarEmprestimo(cpfEmp, capital, taxa, tempo);
                break;
            case 5:
                System.out.print("CPF do cliente: ");
                Cliente clienteJuros = controller.buscarPorCpf(scanner.nextLine());
                if (clienteJuros != null && clienteJuros.getEmprestimo() != null) {
                    System.out.println("Juros Simples: R$ " + clienteJuros.getEmprestimo().calcularJurosSimples());
                }
                break;
            case 6:
                System.out.print("CPF do cliente: ");
                Cliente clienteMont = controller.buscarPorCpf(scanner.nextLine());
                if (clienteMont != null && clienteMont.getEmprestimo() != null) {
                    System.out.println("juros Composto: R$ " + clienteMont.getEmprestimo().calcularMontanteComposto());
                }
                break;
            case 7:
                System.out.print("CPF do cliente: ");
                controller.quitarEmprestimo(scanner.nextLine());
                break;
        }
    } while (opcao != 0);
}

}