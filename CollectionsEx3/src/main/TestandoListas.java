package main;

import java.util.*;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula"; // Insere o texto na vari�vel aula1
		String aula2 = "Conhecendo mais de listas"; // Insere o texto na vari�vel aula2
		String aula3 = "Trabalhando com Cursos e Sets"; // Insere o texto na vari�vel aula3
		ArrayList<String> aulas = new ArrayList<>(); // Instancia o ArrayList, do tipo String, chamado aulas
		aulas.add(aula1); // Insere o valor da vari�vel aula1 no ArrayList aulas
		aulas.add(aula2); // Insere o valor da vari�vel aula2 no ArrayList aulas
		aulas.add(aula3); // Insere o valor da vari�vel aula3 no ArrayList aulas
		System.out.println(aulas); // Mostra na tela o que est� contido no ArrayList aulas
		System.out.println(aulas.size()); // Mostra na tela o tamanho do ArrayList aulas
		// cuidado! <= faz sentido aqui?   
		// --> N�o faz sentido, pois aulas.size()=3, logo o �ndice da �ltima posi��o do array � 2; assim o correto � utilizar o comparador <
		for (int i = 0; i < aulas.size(); i++) { // Percorre o ArrayList aulas enquanto o contador i for menor que aulas.size() *aulas.size()==3, portanto quantidade de �ndices do ArrayList aulas==2
			System.out.println("Aula: " + aulas.get(i)); // Mostra na tela o valor constante no �ndice i do ArrayList aulas
		}
	}
}