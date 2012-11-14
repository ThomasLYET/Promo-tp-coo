package produit;

public abstract class Produit  {

	private final String nom;
	private int prix;

	public Produit(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

}
