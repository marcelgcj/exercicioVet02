package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How many prodcuts do you want to register? ");
		int n = scan.nextInt();
		scan.nextLine();
		Product[] vect = new Product[n];
		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Product's name: ");
			String name = scan.nextLine();
			System.out.print("Price's product: ");
			double price = scan.nextDouble();
			scan.nextLine();
			System.out.println();
			vect[i] = new Product(name, price);
		}
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("Average price: %.2f", avg);
		scan.close();
	}

}
