package view;

import java.util.ArrayList;
import model.Planeta;

public class PlanetaView {
	public void listaPlanetas(ArrayList<Planeta> sistemaSolar) {
		System.out.println("=== Lista de Planetas ===");
		for (Planeta p : sistemaSolar) {
			System.out.println("Planeta: " + p.getNome());
		}
	}

	public void listaVazia() {
		System.out.println("\nA lista esta vazia");
	}

	public void removido() {
		System.out.println("Planeta removido com sucesso!");
	}

	public void menu() {
		System.out.println("\n== MENU ==");
		System.out.println("1 - Adicionar Planeta");
		System.out.println("2 - Remover Planeta");
		System.out.println("3 - Listar Planetas");
		System.out.println("0 - Sair");
		System.out.printf("Escolha uma opcao: ");
	}

	public void cadastrar() {
		System.out.println("=== Adicionar Planeta ===");
		System.out.printf("Insira o nome do Planeta: ");

	}

	public void remove() {
		System.out.println("=== Remover Planeta ===");
		System.out.printf("Insira o nome do Planeta: ");
	}

	public void saindo() {
		System.out.println("Saindo...");
	}

	public void opcaoInvalida() {
		System.out.println("Opcao invalida!");
	}

	public void adicionado() {
		System.out.println("Planeta cadastrado com sucesso!");
	}

	public void naoEncontrado() {
		System.out.println("Planeta não encontrado!");
	}
}
