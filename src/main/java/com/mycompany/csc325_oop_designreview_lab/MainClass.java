/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Freshman std1 = new Freshman("James", (short) 20, 12);
		Senior std2 = new Senior("John", (short) 30, 90);

		System.out.print("Enter GPA for Freshman (James): ");
		std1.setGpa(scanner.nextDouble());

		System.out.print("Enter GPA for Senior (John): ");
		std2.setGpa(scanner.nextDouble());

		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}


