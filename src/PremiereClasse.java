import java.util.Scanner;

public class PremiereClasse {

	public static void main(String[] args) {
		String datesBuilder[][] = {
			{ "", "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre" },
			{ "", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" }
		};
		
		Scanner sc = new Scanner(System.in);
		int nbOfDay = 0, month = 0;
		boolean run = true;
		
		while (run) {
			System.out.print("Choisir un nombre pour obtenir le mois du jour correspondant [1-365] : ");
			nbOfDay = sc.nextInt();
			sc.nextLine();
			
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
			
			System.out.println(datesBuilder[0][month]);
			
			System.out.print("Voulez-vous recommencer [On] ? ");
			String userResponse = sc.nextLine();
			
			if (userResponse.equals("n")) {
				break;
			}
			
			month = 0;
		}
		
		System.out.print("A bientôt ! :)");
		sc.close();
	}

}
