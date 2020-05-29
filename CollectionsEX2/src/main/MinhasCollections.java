package main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); //Instanciamento do ArrayList chamado minhaLista
		minhaLista.add(1); // Adicion o valor 1 � minhaLista
		minhaLista.add(2); // Adicion o valor 2 � minhaLista
		minhaLista.add(2); // Adicion o valor 2 � minhaLista, que n�o ser� ignorado, pois o ArrayList permite repeti��o de valores
		for (Integer listaElementos : minhaLista) { // Percorre minhaLista
			System.out.println(listaElementos); // Mostra na tela o valor armazenado na minhaLista, armazenado no �ndice correspondente � contagem do listaElementos
		}
		
		System.out.println("\n--------------------\n");
		
		Set<Integer> meuSet = new HashSet<Integer>(); // Instanciamento do HashSet chamado meuSet
		meuSet.add(1); // Adiciona o valor 1 ao meuSet
		meuSet.add(2); // Adiciona o valor 2 ao meuSet
		meuSet.add(3); // Adiciona o valor 3 ao meuSet
		meuSet.add(1); // Adiciona o valor 1 ao meuSet, o qual ser� ignorado, visto que j� existe um valor 1 e o HashSet armazena apenas valores exclusivos
		
		int valor;
		Iterator<Integer> iMeuSet = meuSet.iterator(); // Realiza a itera��o em cada item do meuSet
		while(iMeuSet.hasNext()){ // Visto que HashSet armazena apenas valores exclusivos, o valor 1 n�o se repete
			valor = iMeuSet.next(); // Vari�vel valor recebe o pr�ximo elemento de iMeuSet
			System.out.println(valor); // Mostra na tela o valor do pr�ximo elemento do meuSet, constante na vari�vel valor, enquanto houver um proximo elemento (m�todo hasNext())
		}
	}
}