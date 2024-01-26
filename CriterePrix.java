package examen2015;

public class CriterePrix implements Critere{
	
	double prixFixe ;
	
	public CriterePrix(double prixFixe) {
		this.prixFixe = prixFixe;
	}
	public boolean correspond(Object o) {
		if(o instanceof Voiture) {
		if (((Voiture)o).prix <=this.prixFixe)
			return true;
		else
			return false;
		}else
			return false;
	}
}
