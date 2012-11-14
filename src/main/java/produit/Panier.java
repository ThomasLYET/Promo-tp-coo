package produit;

import java.util.ArrayList;

/* Afin de simplifier le code, nous supposerons qu'on peut qu'ajouter un élément
 * dans un Panier.
 */
public class Panier {

	private ArrayList<Produit> p;
	
	public Panier(){
		this.p =  new ArrayList<Produit>();
	}
	
}
