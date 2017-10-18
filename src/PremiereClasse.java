import java.util.Scanner;

public class PremiereClasse {

	public static void main(String[] args) {
		String datesBuilder[][] = {
			{ "", "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre" },
			{ "", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" }
		};
		
		Scanner sc = new Scanner(System.in);
		int nbOfDay = 0, month = 0;
		
		System.out.print("Choississez un nombre entre 1 et 365 pour obtenir le mois du jour correspondant : ");
		nbOfDay = sc.nextInt();
		
		if (nbOfDay < 31*1) month = 1;
		else if (nbOfDay <= (31*1 + 30*1-1)) month = 2;
		else if (nbOfDay <= (31*2 + 30*1-1)) month = 3;
		else if (nbOfDay <= (31*2 + 30*2-1)) month = 4;
		else if (nbOfDay <= (31*3 + 30*2-1)) month = 5;
		else if (nbOfDay <= (31*3 + 30*3-1)) month = 6;
		else if (nbOfDay <= (31*4 + 30*3-1)) month = 7;
		else if (nbOfDay <= (31*5 + 30*3-1)) month = 8;
		else if (nbOfDay <= (31*5 + 30*4-1)) month = 9;
		else if (nbOfDay <= (31*6 + 30*4-1)) month = 10;
		else if (nbOfDay <= (31*6 + 30*5-1)) month = 11;
		else if (nbOfDay <= (31*7 + 30*5-1)) month = 12;
		
		sc.nextLine();
		System.out.println("\n" + datesBuilder[0][month]);
		
		sc.close();
	}

}
