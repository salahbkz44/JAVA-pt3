package td03exo3;

public class CompteBancaire {
	private  int id;
	private String nom , adresse;
	private double solde;
	private boolean actif;
	private final String devise="EURO";
	private static int counter;
	
	public CompteBancaire(String nom,String adresse,double solde) {
		counter++;
		this.id=counter;
        this.nom = nom;
        this.adresse = adresse;
        this.solde = solde;
	}
	
	public void afficher() {
		System.out.print("id : "+id+" || nom : "+ nom + " || adresse : " + adresse + " || solde : " + solde + " || devise : " + devise + " || activité : ");
		if(actif) {
			System.out.print("actif");
		}else {
			System.out.print("inactif");
		}
		System.out.println();
	}
	
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getDevise() {
        return devise;
    }
	
	public void debiterCmpt(double mnt) {
		if(actif) {
			if(solde<mnt) {
				System.out.println("pas assez d'argent!!");
			}else {
				solde -= mnt;
				System.out.println("le nouveau solde est:" + solde);
			}
		}else {
			System.out.println("carte inactif");
		}
	}
	
	public void crediterCmpt(double mnt) {
		if(actif) {
			solde += mnt;
			System.out.println("le nouveau solde est:" + solde);
		}else {
			System.out.println("carte inactif");
		}
	}
	
	public boolean ComparerSolde(CompteBancaire s) {
		if(s.getSolde()>solde) {
			return true;
		}else {
			return false;
		}
	}
	
	public static CompteBancaire ComparerSolde(CompteBancaire a,CompteBancaire b) {
		if(a.getSolde()>b.getSolde()) {
			return a;
		}else {
			return b;
		}
	}
	
}
