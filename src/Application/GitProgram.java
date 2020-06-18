package Application;

import java.util.Scanner;

public class GitProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		boolean andressa = true;
		String palavra;
		System.out.println("Voce me ama me responde nene: ");
		palavra = sc.nextLine();
		while(palavra.equals("sim")) {
			System.out.println("Então eu te amo");
			palavra = sc.nextLine();
			
		}
		System.out.println("oi mocinha td bem com voce como está");
		System.out.println("Entao vai dormir mocreia");
	}

}
