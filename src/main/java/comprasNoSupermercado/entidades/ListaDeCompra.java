package comprasNoSupermercado.entidades;

import java.util.TreeSet;

public class ListaDeCompra {
	
	
	private String lista;
	
	
	String[] splitLista;
	TreeSet<String> treeSet = new TreeSet<String>();
	
	public ListaDeCompra(String lista) {
		this.lista = lista;
	}
	
	public ListaDeCompra() {
	}
	
	public String getLista() {
		return lista;
	}
	
	
	public TreeSet<String> transfObjString() {
		String strLista = String.valueOf(this.lista);
		
		splitLista = strLista.split(" ");

	    for (int i = 0; i < splitLista.length; i++) {
	        treeSet.add(splitLista[i]);
	    }
		return treeSet;		
	}
	
}
