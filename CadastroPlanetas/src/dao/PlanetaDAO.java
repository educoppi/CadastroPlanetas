package dao;

import java.util.ArrayList;

import model.Planeta;

public class PlanetaDAO {
	private ArrayList<Planeta> sistemaSolar;

	public PlanetaDAO() {
		sistemaSolar = new ArrayList<>();
	}

	public ArrayList<Planeta> getSistemaSolar() {
		return sistemaSolar;
	}

	public void adiciona(Planeta planeta) {
		sistemaSolar.add(planeta);
	}

	public void remove(Planeta planeta) {
		sistemaSolar.remove(planeta);
	}
}
