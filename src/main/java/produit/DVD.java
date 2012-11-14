package produit;

public class DVD extends Produit {

	private String realisateur;

	public DVD(int prix, String realisateur, String titreFilm) {
		super(titreFilm, prix);
		this.realisateur = realisateur;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

}
