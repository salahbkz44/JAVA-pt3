package td03exo2;

import java.util.Scanner;

public class LectureClavier {
	public static int LireInt() {
		Scanner si = new Scanner(System.in);
		int i = si.nextInt();
		return i;
	}
	
	public static double LireDouble() {
		Scanner sd = new Scanner(System.in);
		double d = sd.nextDouble();
		return d;
	}
	
	public static String LireString() {
		Scanner ss = new Scanner(System.in);
		String s = ss.nextLine();
		return s;
	}
	
	public static char LireChar() {
		Scanner sc= new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}
}
