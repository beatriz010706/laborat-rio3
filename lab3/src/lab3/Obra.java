package lab3;
/**
 * @author diogo garcia
 */
public class Obra {
	String titulo;
    String autor;
    int ano;

    public Obra(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
    public String getDetalhes() {
        return "Título: " + titulo + "Autor: " + autor + "Ano: " + ano;
    }

}
