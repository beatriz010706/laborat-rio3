/**
 * 
 */
package lab3;

/**
 * @author inês rodrigues
 */
public class Escultura extends Obra{
	private String material;
	
	public Escultura(String titulo, String autor, int ano,String material) {
	    super(titulo, autor, ano);
	    this.material=material;
	}
	public String getMaterial() {
	    return material;
	}

}
