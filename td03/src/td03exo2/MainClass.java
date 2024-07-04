package td03exo2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[3];
		System.out.println("entrez les valeurs:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=LectureClavier.LireInt();
		}
		System.out.println("l'inverse du tableau est:");
		BiblioTab.afficherTab(BiblioTab.inverse(a));
		BiblioTab.afficherT2T(BiblioTab.multiplemat(a));
		System.out.println();
	
	
	char t1[] =new char[] {'a','l','a'}; 
	System.out.println(BiblioTab.checkPalin(t1));
	char t2[] =new char[] {'a','l','a','l'}; 
	System.out.println(BiblioTab.checkEgality(t1, t2));
	System.out.println(BiblioTab.sommeTab(a));
	}
}
