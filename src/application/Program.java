package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + n + "data");
			System.out.print("Individual or company (i/c)?");
			char option = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:");
			double anualIncome = sc.nextDouble();
			if (option == 'i') {
				System.out.print("Health expenditures:");
				double heathExpenditures = sc.nextDouble();
				payers.add(new Individual(name, anualIncome, heathExpenditures ));
			} else {
				System.out.println("Number of employees:");
				int numberOfEmployees = sc.nextInt();
				payers.add(new Company(name, anualIncome,numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double count = 0;
		for(TaxPayer p : payers) {
			System.out.println(p);
			count += p.tax(); 
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n",count);
		
		sc.close();

	}

}
