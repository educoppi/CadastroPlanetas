package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import dao.PlanetaDAO;
import model.Planeta;
import view.PlanetaView;

public class PlanetaController {
	private PlanetaView planetaView;
	private PlanetaDAO planetaDAO;

	public PlanetaController() {
		planetaView = new PlanetaView();
		planetaDAO = new PlanetaDAO();
		menu();
	}

	public void cadastra(String nome) {
		var planeta = new Planeta(nome);
		planetaDAO.adiciona(planeta);
	}

	public void remove(String nome) {
		if (!planetaDAO.getSistemaSolar().isEmpty()) {
			for (Planeta p : planetaDAO.getSistemaSolar()) {
				if (p.getNome().equals(nome)) {
					planetaDAO.remove(p);
					planetaView.removido();
					return;
				}
			}
			planetaView.naoEncontrado();
			return;
		} else {
			planetaView.listaVazia();
		}
	}

	public void exibeLista() {
		if (!planetaDAO.getSistemaSolar().isEmpty()) {
			planetaView.listaPlanetas(planetaDAO.getSistemaSolar());
		} else {
			planetaView.listaVazia();
		}
	}

	public void menu() {
		var input = new Scanner(System.in);
		int opcao = -1;
		while (opcao != 0) {
			planetaView.menu();
			try {
				opcao = input.nextInt();
			} catch (InputMismatchException e) {
				planetaView.opcaoInvalida();
				menu();
			}
			switch (opcao) {
			case 1 -> {
				planetaView.cadastrar();
				input.nextLine();
				String nome = input.nextLine();

				cadastra(nome);
				planetaView.adicionado();
			}

			case 2 -> {
				planetaView.remove();
				input.nextLine();
				String nome = input.nextLine();

				remove(nome);
			}

			case 3 -> {
				exibeLista();
			}

			case 0 -> {
				planetaView.saindo();
				input.close();
			}

			default -> {
				planetaView.opcaoInvalida();
			}
			}

		}
	}
}
