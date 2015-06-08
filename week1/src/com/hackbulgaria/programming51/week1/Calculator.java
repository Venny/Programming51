package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();
		int sum = 0;

		if (oper == '+') {
			sum = a + b;
		} else if (oper == '-') {
			sum = a - b;
		} else if (oper == '*') {
			sum = a * b;
		} else if (oper == '/') {
			sum = a / b;
		} else if (oper == '^') {
			sum = a;
			for(int i = 1; i <= b; i++){
				sum *= a;
			}
		} else if (oper == '?') {
			for (int i = a; i > 0; i--) {
				a *= i;
			}
			for (int i = b; i > 0; i--) {
				b *= i;
			}
			sum = a + b;
		}

		System.out.println(sum);

	}

}
