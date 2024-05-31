package Practicejava;

import java.util.Scanner;

public class Evenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the no");
		int n=reader.nextInt();

		if(n%2==0) {

			System.out.println(n  + "is even");

		}
		else {

			System.out.println((n + "is odd"));
		}





	}

}
