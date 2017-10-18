public class PremiereClasse {

	public static void main(String[] args) {
		String tab[] = { "Tu as ", " ans", " et demi" };
		int age = 78;

		// Proposition de possibilité
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + (i == 0 ? age : ""));
		}
	}

}
