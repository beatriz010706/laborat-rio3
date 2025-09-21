package lab3;


import java.util.ArrayList;


public class GerirObra {
	private ArrayList<Obra> obras;

	/**
	 * @param obras
	 */
	public GerirObra() {
		obras = new ArrayList<>();
	}
	
	public void registarObra(String titulo, String autor, int ano) {
		for (Obra o : obras) {
			if (o.getTitulo().equalsIgnoreCase(titulo) & o.getAutor().equalsIgnoreCase(autor)) {
				System.out.println("Obra já existente");
				return;
			}
		}
		obras.add(new Obra(titulo, autor, ano));
		System.out.println("Obra registada");
	}
	
	public void imprimirObras() {
		for (Obra o : obras) {
			System.out.println("Título: " + o.getTitulo());
			System.out.println("Autor: " + o.getAutor());
			System.out.println("Ano: " + o.getAno());
		}
	}
	
	public void pesquisarObras(String titulo) {
		for (Obra o : obras) {
			if (o.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Título: " + o.getTitulo());
				System.out.println("Autor: " + o.getAutor());
				System.out.println("Ano: " + o.getAno());
				return;
			}
		}
		System.out.println("Obra não encontrada");
	}
	
	public void imprimirPorTela
	
	
}
