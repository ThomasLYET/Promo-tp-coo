package produit;

public class CD extends Produit {
	private String auteur;

	public CD(int prix, String auteur, String titreAlbum) {
		super(titreAlbum, prix);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
