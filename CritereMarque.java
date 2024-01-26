package examen2015;

public class CritereMarque implements Critere{
	String marque_donne ;
	public CritereMarque(String marque) {
		this.marque_donne = marque ;
	}
	public boolean correspond(Object o) {
		if(o instanceof Voiture) {
		if(((Voiture)o).marque.equals(this.marque_donne))
			return true ;
		else 
			return false ;
		}else
			return false;
	}
}
