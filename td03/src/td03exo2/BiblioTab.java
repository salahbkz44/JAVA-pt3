package td03exo2;

import java.util.Scanner;

public class BiblioTab {
	
	public static int[] inverse(int a[]) {
		int tab[]=new int [a.length];
		for (int i =0;i<a.length;i++) {
			tab[a.length-(1+i)]=a[i];
		}
		return tab;
		
	}
	
	public static int[][] multiplemat(int a[]){
		int mat[][]=new int [3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<4;j++) {
				mat[i][j]=a[i]*(j+1);
			}
		}
		return mat;
	}
	
	
	public static void lireTab(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]=LectureClavier.LireInt();
		}
	}
	
	
	public static int sommeTab(int a[]) {
		int s=0;
		
		for (int i=0;i<a.length;i++)
			s+=a[i];
		
		return s;		
	}
	
	public static double sommeTab(double a[]) {
		double s=0;
		
		for (int i=0;i<a.length;i++)
			s+=a[i];
		
		return s;		
	}
	
    public static void afficherT2T(int a[][]) {
		
		for(int i=0;i<a.length;i++) {			
			System.out.println(" ");	
			for(int j=0;j<a[i].length;j++) 
				System.out.print(" "+a[i][j]);
		}	
		
    }
    
    public static double[] somdeuxTab(double []a, double b[]) {
		
		double tr[]=new double [a.length];	
		
		if (a.length==b.length)
			for(int i=0; i<a.length;i++)
				tr[i]=a[i]+b[i];
		else
			System.out.println("Pas possible ! ");		
		
		return tr;				
	}
    
	public static int[] somdeuxTab(int []a, int b[]) {
		
		int tr[]=new int [a.length];	
		
		if (a.length==b.length)
			for(int i=0; i<a.length;i++)
				tr[i]=a[i]+b[i];
		else
			System.out.println("Pas possible ! ");		
		
		return tr;		
		
	}

	public static boolean checkEgality(char[]a1, char []a2) {
		
		boolean eg=true;
		int i=0;
		
		if (a1.length==a2.length)
			while ((i<a1.length)&&(eg)) {
				if(a1[i]!=a2[i]) {
					eg=false;
				}
			  i++;
			}
		else {
			eg=false;
			System.out.println("Les deux tableaux ne sont pas de meme taile ! ");
		}
		return eg;
	}
	
	public static boolean checkPalin(char a[]) {
		
		int i,j;
		i=0;
		j=a.length-1;
		boolean paline=true;
		
		while ((paline)&&(i<j)) {
			if (a[i]!=a[j])
				paline=false;
			else {
				i++;
				j--;
			}
		}
		return paline;
		
		
	}
	
	public static void afficherTab(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
