import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SorteioCafeteira {

	private static ArrayList<String> pessoas;

	public static void main(String[] args) {

		System.out.println("********* INICIANDO GRANDIOSO SORTEIO *********");

		pessoas = new ArrayList<String>();
		adicionarPessoa("Luciano", 9);
		adicionarPessoa("Jorge", 9);
		adicionarPessoa("Amauri", 7);
		adicionarPessoa("Carlos", 9);
		adicionarPessoa("Daniel", 8);
		adicionarPessoa("Fernando Angeloni", 7);
		adicionarPessoa("Rafael Guimarães", 5);

		Collections.shuffle(pessoas);

		Random r = new Random();
		int valorSorteado = r.nextInt(pessoas.size());

		String contemplado = pessoas.get(valorSorteado);

		System.out.println("Sorteado: " + contemplado);

		System.out.println("*********   FIM DO GRANDIOSO SORTEIO  *********");
	}

	private static void adicionarPessoa(String nome, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			pessoas.add(nome);
		}
	}

}