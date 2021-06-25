package curso_programacao;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		/*
		for ( inicio ; condição ; incremento ) {
			comando 1
			comando 2
		}
		*/
		
		
		System.out.println(soma);
		
		sc.close();
	}
	/*public static void main(String[] args) {
		
		for(int i = 10; i>=0; i--) {
			System.out.println("Vai começar emmm... " + i);
		}
	}*/

}
