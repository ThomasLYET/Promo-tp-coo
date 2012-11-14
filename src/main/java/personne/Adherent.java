package personne;

import java.util.ArrayList;
import offre.OffreCommerciale;

public class Adherent extends Personne {

	private static ArrayList<OffreCommerciale> offre = null;

	public Adherent(int theId) {
		super(theId);
	}

	public void ajouterOffre(OffreCommerciale o) {
		Adherent.offre.add(o);
	}

	public void ajouterPlusieursOffre(ArrayList<OffreCommerciale> o) {
		Adherent.offre.addAll(o);
	}

}
