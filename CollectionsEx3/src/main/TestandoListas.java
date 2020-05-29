package main;

import java.util.*;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula"; // Insere o texto na variável aula1
		String aula2 = "Conhecendo mais de listas"; // Insere o texto na variável aula2
		String aula3 = "Trabalhando com Cursos e Sets"; // Insere o texto na variável aula3
		ArrayList<String> aulas = new ArrayList<>(); // Instancia o ArrayList, do tipo String, chamado aulas
		aulas.add(aula1); // Insere o valor da variável aula1 no ArrayList aulas
		aulas.add(aula2); // Insere o valor da variável aula2 no ArrayList aulas
		aulas.add(aula3); // Insere o valor da variável aula3 no ArrayList aulas
		System.out.println(aulas); // Mostra na tela o que está contido no ArrayList aulas
		System.out.println(aulas.size()); // Mostra na tela o tamanho do ArrayList aulas
		// cuidado! <= faz sentido aqui?   
		// --> Não faz sentido, pois aulas.size()=3, logo o índice da última posição do array é 2; assim o correto é utilizar o comparador <
		for (int i = 0; i < aulas.size(); i++) { // Percorre o ArrayList aulas enquanto o contador i for menor que aulas.size() *aulas.size()==3, portanto quantidade de índices do ArrayList aulas==2
			System.out.println("Aula: " + aulas.get(i)); // Mostra na tela o valor constante no índice i do ArrayList aulas
		}
	}
}