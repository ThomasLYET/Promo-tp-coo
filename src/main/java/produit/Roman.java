package produit;

public class Roman extends Produit {

	private String auteur;

	public Roman(int prix, String auteur, String titreRoman) {
		super(titreRoman, prix);
		this.auteur = auteur;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
