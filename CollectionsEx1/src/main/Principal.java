package main;

import java.util.*;

import model.Telefone;

public class Principal {

	public static void main(String[] args) {
		List<Telefone> lista = new ArrayList<Telefone>();
		Telefone tel1 = new Telefone("3456-7890", 0);
		Telefone tel2 = new Telefone("3815-5296", 1);
		Telefone tel3 = new Telefone("98523-8514", 2);
		
		lista.add(tel1);
		lista.add(tel2);
		lista.add(tel3);
		System.out.println(lista);
		
		Telefone telefone;
		Iterator<Telefone> itr = lista.iterator();
		while(itr.hasNext()) {
			telefone = itr.next();
			System.out.print(telefone.getNrTelefone());
			System.out.print("   |   ");
			switch(telefone.getTipoTelefone()) {
				case 0: System.out.print("Residencial\n"); break;
				case 1: System.out.print("Comercial\n"); break;
				case 2: System.out.print("Celular\n"); break;
				default: System.out.print("Erro!!!\n"); break;
			}
		}
	}

}
