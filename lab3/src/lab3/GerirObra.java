/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.ArrayList;
public class GerirObra {
	private ArrayList<Obra> obras;
	private ArrayList<Pintura> pinturas;
	private ArrayList<Escultura> esculturas;
	private ArrayList<PinturaOleo> pinturasOleo;
	

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
	
	public void imprimirPorTela(String tipoTela) {
		 boolean found = false;
		 
		 for (Obra o : obras) {
		        String tela = ((PinturaOleo) o).getTipoTela();
		        if (tela != null & tela.equalsIgnoreCase(tipoTela)) {
		            System.out.println("Título: " + o.getTitulo());
		            System.out.println("Autor: " + o.getAutor());
		            found = true;
	        }
        }
		 if (!found) {
		        System.out.println("Nenhuma obra encontrada com o tipo de tela: " + tipoTela);
		    }

	}
	
	public void imprimirDetalhesAgrupados() {
		ArrayList<Obra> pinturas = new ArrayList<>();
	    ArrayList<Obra> pinturasOleo = new ArrayList<>();
	    ArrayList<Obra> esculturas = new ArrayList<>();
	    
	    for (Obra o : obras) {
	    	if (o instanceof Pintura) {
	    		pinturas.add(o);
	    	}
	    	if (o instanceof Escultura) {
	    		esculturas.add(o);
	    	}
	    	if (o instanceof PinturaOleo) {
	    		pinturasOleo.add(o);
	    	}
	    }
	    System.out.println("Pinturas:");
	    for (Obra o : pinturas) {
	    	System.out.println(o);
	    }
	    System.out.println(pinturas.size() + " pinturas.");
	    
	    System.out.println("Pinturas a Oleo: ");
	    for(Obra o : pinturasOleo) {
	    	System.out.println(o);
	    }
	    System.out.println(pinturasOleo.size() + " pinturas a oleo");
	    
	    System.out.println("Esculturas: ");
	    for(Obra o : esculturas) {
	    	System.out.println(o);
	    }
	    System.out.println(esculturas.size() + " esculturas.");
	    
	}
	
}
