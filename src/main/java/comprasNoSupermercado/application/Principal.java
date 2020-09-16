package comprasNoSupermercado.application;

import comprasNoSupermercado.entidades.ListaDeCompra;

import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		String str = null;
		
		ListaDeCompra lc = new ListaDeCompra();
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtde de listas");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Digite a "+i+" lista");
			String lista = sc.nextLine();
			lc = new ListaDeCompra(lista);
			str = String.valueOf(lc.transfObjString());
			treeSet.add(str);
		}
		
		for (String s : treeSet) {
			System.out.println(s);
		}
				
		sc.close();

	}

}
