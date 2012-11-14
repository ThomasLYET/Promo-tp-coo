package personne;

import java.util.ArrayList;
import offre.OffreCommerciale;

public class Personnel extends Personne{
	
	private static ArrayList<OffreCommerciale> offre = null;

	public Personnel(int theId) {
		super(theId);
	}
	
	public void ajouterOffre(OffreCommerciale o) {
		Personnel.offre.add(o);
	}
	
	public void ajouterPlusieursOffre(ArrayList<OffreCommerciale> o) {
		Personnel.offre.addAll(o);
	}

}
