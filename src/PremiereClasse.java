import java.util.Scanner;

public class PremiereClasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HandlerDate handlerDate = new HandlerDate();
		
		while (true) {
			handlerDate.selectMonth(sc);
			
			System.out.print("Voulez-vous recommencer [On] ? ");
			String userResponse = sc.nextLine();
			
			if (userResponse.equals("n")) {
				break;
			}
		}
		
		System.out.print("A bientôt ! :)");
		sc.close();
	}

}