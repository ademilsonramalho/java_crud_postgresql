package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controllers.ClienteController;
import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n *** CONTROLE DE CLIENTES *** \n");
		System.out.println("(1) - Cadastrar cliente");
		System.out.println("(2) - Atualizar cliente");
		System.out.println("(3) - Excluir cliente");
		System.out.println("(4) - Consultar todos os clientes");

		System.out.print("\nEscolha uma op��o: ");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		ClienteController clienteController = new ClienteController();

		switch (opcao) {

		case 1: // cadastrar cliente
			clienteController.cadastrarCliente();
			break;

		case 2: // atualizar cliente
			clienteController.atualizarCliente();
			break;

		case 3: // excluir cliente
			clienteController.excluirCliente();
			break;

		case 4: // consultar todos os clientes
			clienteController.consultarClientes();
			break;

		default:
			System.out.println("\nOp��o inv�lida.");
			break;

		}
	}
}
