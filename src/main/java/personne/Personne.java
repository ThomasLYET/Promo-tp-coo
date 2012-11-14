package personne;

import produit.Panier;
import produit.Produit;

public abstract class Personne {

	private int id;
	private Panier sonPanier;

	public Personne(int theId) {
		this.id = theId;
		this.sonPanier = new Panier();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void ajouterProduit(Produit p) {
		// TODO this.sonPanier.add(p);
	}

}
