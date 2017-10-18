import java.io.PrintStream;

public class PremiereClasse {

	public static void main(String[] args) {
		PrintStream out = System.out;
		String tab[] = { "Tu as ", " ans", " et demi" };
		int age = 56;
		
		// Proposition de possibilité 1
		for (int i = 0; i < tab.length; i++) {
			if (i == 0) out.print(tab[i] + age);
			else out.print(tab[i]);
		}
		
		out.println();
		
		// Proposition de possibilité 2
		for (String str : tab) {
			if (str.equals(tab[tab.length-2])) {
				out.print(age + str);
			} else {
				out.print(str);
			}
		}
		
		out.println();
		
		// Proposition de possibilité 3
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 != 0) {
				out.print(age);
			}
			out.print(tab[i]);
		}
	}

}
