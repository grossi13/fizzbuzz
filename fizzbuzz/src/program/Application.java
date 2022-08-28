package program;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Application app = new Application();

		String print = "";

		System.out.print("Diga um numero para contar até : ");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			print = "";

			Boolean three = app.containDigit(i, 3);
			Boolean five = app.containDigit(i, 5);

			if (three) {
				print += "fizz";
			}
			if (five) {
				print += "buzz";
			}

			if (i % 3 == 0) {
				print += "fizz";
				if (i % 5 == 0) {
					print = "fizzbuzz";
				}
			} else if (i % 5 == 0) {
				print += "buzz";
			} else if (print == "") {
				print = "" + i;
			}

			System.out.println(print);
		}

		sc.close();
	}

	public Boolean containDigit(int number, int digit) {
		while (number != 0) {
			if (number % 10 == digit) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

}
