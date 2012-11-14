package personne;

import java.util.ArrayList;
import offre.OffreCommerciale;

public final class Client extends Personne {
	
	private static ArrayList<OffreCommerciale> offre = null;
	
	public Client(int id) {
		super(id);
	}
	
	public void ajouterOffre(OffreCommerciale o) {
		Client.offre.add(o);
	}
	
	public void ajouterPlusieursOffre(ArrayList<OffreCommerciale> o) {
		Client.offre.addAll(o);
	}
	
}
