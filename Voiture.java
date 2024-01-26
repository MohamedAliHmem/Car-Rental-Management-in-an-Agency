package examen2015;

class Voiture
{ 
	String marque ;
	String modele ;
	int anneP;
	double prix;
public Voiture(String m,String mo , int a, double p)
{ 
	this.marque = m ;
	this.modele = mo ;
	this.anneP = a ;
	this.prix = p ;
}

public String getMarque(){ return marque ;}
public String getModele() { return modele;}
public int getAnne() { return anneP;}
public double getPrix() { return prix;}
@Override
public String toString() {
	return "Voiture [marque=" + this.getMarque() + ", modele=" + this.getModele() + ", anneP=" + this.getAnne() + ", prix=" + this.getPrix() + "]";
}


}