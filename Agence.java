package examen2015;

public class Agence {
	Voiture [] Lesvoitures ;
	String reference ;
	int taille ;
	int nbrvoitures =0;
	
	public Agence(String reference, int taille) {
		this.Lesvoitures = new Voiture[taille];
		this.reference = reference;
		this.taille = taille;
	}
	
	void selectionne(Critere c) {
		for (int i=0; i< this.nbrvoitures;i++) {
			if (c.correspond(this.Lesvoitures[i]))
				System.out.println(this.Lesvoitures[i].toString()); 
		}
	}
	
	void ajout(Voiture v) throws AjoutInterditException{
		if (2016-v.anneP<=5)  {
			this.Lesvoitures[this.nbrvoitures] = v;
			this.nbrvoitures++;
			}else
				throw new AjoutInterditException("superieur a 5 ans");
		
		
	}
	
	public static void main( String args[])
	{ 
	Agence A1= new Agence("dali",100) ;
	Voiture V1=new Voiture("FORD ","Fiesta",2000,11.000) ;
	Voiture V2=new Voiture("KIA","Rio",2012,28.500) ;
	Voiture V3=new Voiture("KIA","Picanto",2015,26.000) ;
	Voiture V4=new Voiture("OPEL","Astra",2013,45.000) ;
	 try {
		 
		 A1.ajout(V1) ; 

	} catch (AjoutInterditException e) {
		e.printStackTrace();
	}
try {
		 
		 A1.ajout(V2) ; 

	} catch (AjoutInterditException e) {
		e.printStackTrace();
	}
try {
	 
	 A1.ajout(V3) ; 

} catch (AjoutInterditException e) {
	e.printStackTrace();
}
try {
	 
	 A1.ajout(V4) ; 

} catch (AjoutInterditException e) {
	e.printStackTrace();
}
	// CriterePrix c = new CriterePrix(30.900);
	 CritereMarque c=new CritereMarque("KIA");
	 A1.selectionne(c);
	 
	 
	 
	}

}



	
