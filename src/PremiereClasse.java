import java.util.Scanner;

public class PremiereClasse {

	public static void main(String[] args) {
		String tab[] = { "Tu as ", " ans", " et demi" };
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("Quel age as-tu ? ");
		age = sc.nextInt();
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + (i == 0 ? age : ""));
		}
	}

}
