package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		//Entrada de quartos
		System.out.printf("How many rooms will be rented? Enter: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			//Qual o número do quarto
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			//Entrada do Nome
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			//Entrada do Email
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
