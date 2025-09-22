package lab3;

public class Pintura extends Obra{
    String tecnica;

    public Pintura(String titulo, String autor, int ano, String tecnica) {
        super(titulo, autor, ano);
        this.tecnica = tecnica;
    }
    public String getTecnica() {
        return tecnica;
    }
}//fim classe