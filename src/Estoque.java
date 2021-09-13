import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Estoque {

	public Estoque() {
		inicializaEstoque();
	}

	List<Produto> produtos = new ArrayList<>();

	public void inicializaEstoque() {

		produtos.add(new Produto("G5-1", "Luminaria de mesa", 119.99));
		produtos.add(new Produto("G5-2", "Poltrona", 799.99));
		produtos.add(new Produto("G5-3", "Abajur", 109.99));
		produtos.add(new Produto("G5-4", "Estante", 380.99));
		produtos.add(new Produto("G5-5", "Escrivaninha", 539.99));
		produtos.add(new Produto("G5-6", "Cadeira de escrit�rio", 649.99));
		produtos.add(new Produto("G5-7", "Cama Box", 850.99));
		produtos.add(new Produto("G5-8", "Cadeira Gamer", 999.99));
		produtos.add(new Produto("G5-9", "Mesa de centro", 220.99));
		produtos.add(new Produto("G5-10", "Sof�", 950.99));
	}

	public void mostraEstoque() {
		cimaMenu();
		linha();
		for (Produto produto : produtos) {

			produto.retornaEstoqueMenu();

		}
		System.out.println("");

	}
	public void mostraCarrinho() {
		cimaMenu();
		linha();
		for (Produto produto : produtos) {
			if (produto.getCarrinho()!=0) {
				produto.retornaCarrinhoMenu();
			}
			

		}
		System.out.println("");

	}
	
	public void mostraNota() {
		linha();
		for (Produto produto : produtos) {
			if (produto.getCarrinho()!=0) {
				produto.retornaCarrinhoNota();
			}
			

		}
		System.out.println("");

	}

	public void cimaMenu() {
		linha();
		System.out.print("Codigo");
		Produto.espacoNome("Codigo", 18);
		System.out.print("Produto");
		Produto.espacoNome("Produto", 30);
		System.out.print("         " + "Pre�o" + "           " + "Estoque\n");
		linha();
	}

	public Produto consultaProduto(String codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo().equals(codigo)) {
				return produto;
			}
		}
		return new Produto("G5-11", "codigo errado", 0, 0);

	}

	public void retiraEstoque(Produto produto, int quantidade) {
		produto.tiraEstoque(quantidade);
		produto.acrescentaCarrinho(quantidade);
	}

	public static void linha() {
		System.out.println("--------------------------------------------------------------------------------");
	}

}
// List<String> nomes = new ArrayList<>();

// List <Produto> lista = new ArrayList<>();

// lista.add(new Produto("G5-1","Luminaria de mesa", 119.99));

/*
 * Menu Pol = new Menu("G5-2","Poltrona", 799.99); Menu AM = new
 * Menu("G5-3","Abajur", 109.99); Menu Est = new Menu("G5-4","Estante",
 * 380.99)); Menu Esc = new Menu("G5-5","Escrivaninha", 539.99)); Menu CdE = new
 * Menu("G5-6","Cadeira de escrit�rio", 649.99)); Menu CBox = new
 * Menu("G5-7","Cama Box", 850.99)); Menu CGamer = new
 * Menu("G5-8","Cadeira Gamer", 999.99)); Menu MCentro = new
 * Menu("G5-9","Mesa de centro", 220.99)); Menu Sofa = new Menu("G5-10","Sof�",
 * 950.99));
 */
