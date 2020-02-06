import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Skriv in ett nummer: ");
		int nr1 = userInput.nextInt();
		System.out.println("Skriv in ett till nummer: ");
		int nr2 = userInput.nextInt();
		
		
		
		System.out.println("Summan av dina tal är: " + (nr1 + nr2));
		
	}

}

