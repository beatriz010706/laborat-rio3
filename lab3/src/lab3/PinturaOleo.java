package lab3;

public class PinturaOleo extends Pintura {
    String tipoTela;

    public PinturaOleo(String titulo, String autor, int ano, String tecnica, String tipoTela) {
        super(titulo, autor, ano, tecnica);
        this.tipoTela = tipoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }
}//fim classe


