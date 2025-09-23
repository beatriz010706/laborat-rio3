/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        GerirObra gestor = new GerirObra();

        int opcao;
        do {
            System.out.println("MENU:");
            System.out.println("1. Registar uma obra");
            System.out.println("2. Imprimir todas as obras");
            System.out.println("3. Pesquisar obra por título");
            System.out.println("4. Imprimir pinturas a óleo por tipo de tela");
            System.out.println("5. Imprimir obras agrupadas por tipo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção:");
            opcao = ler.nextInt();
            ler.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de obra (1-Pintura, 2-Pintura a Óleo, 3-Escultura): ");
                    int tipo = ler.nextInt();
                    ler.nextLine(); // limpar buffer
                    System.out.print("Título: ");
                    String titulo = ler.nextLine();
                    System.out.print("Autor: ");
                    String autor = ler.nextLine();
                    System.out.print("Ano: ");
                    int ano = ler.nextInt();
                    ler.nextLine(); // limpar buffer

                    if (tipo == 1) {
                        System.out.print("Técnica: ");
                        String tecnica = ler.nextLine();
                        gestor.registarObra(new Pintura(titulo, autor, ano, tecnica));
                    } else if (tipo == 2) {
                        System.out.print("Técnica: ");
                        String tecnica = ler.nextLine();
                        System.out.print("Tipo de tela: ");
                        String tipoTela = ler.nextLine();
                        gestor.registarObra(new PinturaOleo(titulo, autor, ano, tecnica, tipoTela));
                    } else if (tipo == 3) {
                        System.out.print("Material: ");
                        String material = ler.nextLine();
                        gestor.registarObra(new Escultura(titulo, autor, ano, material));
                    } else {
                        System.out.println("tipo inválido");
                    }
                    break;

                case 2:
                    gestor.imprimirObras();
                    break;

                case 3:
                    System.out.print("título da obra a pesquisar: ");
                    String t = ler.nextLine();
                    gestor.pesquisarObra(t);
                    break;

                case 4:
                    System.out.print("tipo de tela a procurar: ");
                    String tela = ler.nextLine();
                    gestor.imprimirPorTela(tela);
                    break;

                case 5:
                    gestor.imprimirAgrupado();
                    break;

                case 0:
                    System.out.println("a sair...");
                    break;

                default:
                    System.out.println("opção inválida!");
            }
        } while (opcao != 0);

        ler.close();
    }

	}

}
