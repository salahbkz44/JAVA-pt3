package td03exo3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteBancaire cmpt1 = new CompteBancaire( "salah", "setif", 1000.50);
		CompteBancaire cmpt2 = new CompteBancaire( "khaled", "alger", 750.25);
		CompteBancaire cmpt3 = new CompteBancaire( "mohamed", "eulma", 500.75);
		cmpt1.setActif(true);
		cmpt2.setActif(true);
		cmpt3.setActif(true);
		cmpt1.afficher();
		cmpt2.afficher();
		cmpt3.afficher();
		System.out.println("\n");
		cmpt1.debiterCmpt(500.5);
		cmpt1.crediterCmpt(700);
		cmpt1.afficher();

		cmpt2.debiterCmpt(500.5);
		cmpt2.crediterCmpt(700);
		cmpt2.afficher();

		cmpt3.debiterCmpt(600.5);
		cmpt3.crediterCmpt(700);
		cmpt3.afficher();
		
		System.out.println(cmpt1.ComparerSolde(cmpt3));
		
		CompteBancaire.ComparerSolde(cmpt2, cmpt3).afficher();
		
	}

}
