package main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); //Instanciamento do ArrayList chamado minhaLista
		minhaLista.add(1); // Adicion o valor 1 à minhaLista
		minhaLista.add(2); // Adicion o valor 2 à minhaLista
		minhaLista.add(2); // Adicion o valor 2 à minhaLista, que não será ignorado, pois o ArrayList permite repetição de valores
		for (Integer listaElementos : minhaLista) { // Percorre minhaLista
			System.out.println(listaElementos); // Mostra na tela o valor armazenado na minhaLista, armazenado no índice correspondente à contagem do listaElementos
		}
		
		System.out.println("\n--------------------\n");
		
		Set<Integer> meuSet = new HashSet<Integer>(); // Instanciamento do HashSet chamado meuSet
		meuSet.add(1); // Adiciona o valor 1 ao meuSet
		meuSet.add(2); // Adiciona o valor 2 ao meuSet
		meuSet.add(3); // Adiciona o valor 3 ao meuSet
		meuSet.add(1); // Adiciona o valor 1 ao meuSet, o qual será ignorado, visto que já existe um valor 1 e o HashSet armazena apenas valores exclusivos
		
		int valor;
		Iterator<Integer> iMeuSet = meuSet.iterator(); // Realiza a iteração em cada item do meuSet
		while(iMeuSet.hasNext()){ // Visto que HashSet armazena apenas valores exclusivos, o valor 1 não se repete
			valor = iMeuSet.next(); // Variável valor recebe o próximo elemento de iMeuSet
			System.out.println(valor); // Mostra na tela o valor do próximo elemento do meuSet, constante na variável valor, enquanto houver um proximo elemento (método hasNext())
		}
	}
}