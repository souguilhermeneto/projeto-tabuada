package project_tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("Digite o número que deseja a tabuada:");
		number = sc.nextInt();
		System.out.println();
		System.out.println("A tabuada do " + number + " é:");
		
		for (int i = 1; i<=10; i++) {
			System.out.println(number + " X " + i + " = " + (number*i));
			
		}
				
		sc.close();

	}

}
