/**
 * 
 */
package lab3;

/**
 * @author gonçalo silva
 */
import java.util.ArrayList;
public class GerirObra {
	ArrayList<Obra> obras = new ArrayList<>();

    public GerirObra() {
        obras = new ArrayList<>();
    }
    // a) Registar uma obra (não pode haver duas com o mesmo título e autor)
    public void registarObra(Obra o) {
        for (Obra obra : obras) {
            if (obra.getTitulo().equalsIgnoreCase(o.getTitulo()) &&
                    obra.getAutor().equalsIgnoreCase(o.getAutor())) {
                System.out.println("Já existe uma obra com esse título e autor!");
                return;
            }
        }
        obras.add(o);
        System.out.println("Obra registada com sucesso!");
    }
    // b) Imprimir todos os detalhes de todas as obras
    public void imprimirObras() {
        if (obras.isEmpty()) {
            System.out.println("Não existem obras registadas.");
            return;
        }
        for (Obra o : obras) {
            System.out.println(o.getDetalhes());
        }
    }
    // c) Pesquisar uma obra pelo título
    public void pesquisarObra(String titulo) {
        for (Obra o : obras) {
            if (o.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(o.getDetalhes());
                return;
            }
        }
        System.out.println("Obra de arte não encontrada.");
    }
    // d) Imprimir o título e o autor das pinturas a óleo com determinado tipo de tela
    public void imprimirPorTela(String tipoTela) {
        boolean encontrou = false;
        for (Obra o : obras) {
            if (o instanceof PinturaOleo) {
                PinturaOleo po = (PinturaOleo) o;
                if (po.getTipoTela().equalsIgnoreCase(tipoTela)) {
                    System.out.println("Título: " + po.getTitulo() + "Autor: " + po.getAutor());
                    encontrou = true;
                }
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma pintura a óleo encontrada com tela " + tipoTela);
        }
    }
    // e) Imprimir agrupadas por tipo e contar
    public void imprimirAgrupado() {
        int pinturas = 0;
        int pinturasOleo = 0;
        int esculturas = 0;

        for (Obra o : obras) {
            if (o instanceof PinturaOleo) {
                pinturasOleo++;
                System.out.println("[Pintura a Óleo]");
            } else if (o instanceof Pintura) {
                pinturas++;
                System.out.println("[Pintura]");
            } else if (o instanceof Escultura) {
                esculturas++;
                System.out.println("[Escultura]");
            }
            System.out.println(o.getDetalhes());
            System.out.println("-----");
        }

        System.out.println("Resumo:");
        System.out.println("Pinturas: " + pinturas);
        System.out.println("Pinturas a Óleo: " + pinturasOleo);
        System.out.println("Esculturas: " + esculturas);
    }
	
}
