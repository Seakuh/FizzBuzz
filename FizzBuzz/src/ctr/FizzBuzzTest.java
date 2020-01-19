package ctr;

public class FizzBuzzTest {
	public static void main(String[] args) {

		int a = 4;
		int b = 6;

		for (int i = 1; i < 100; i++) {

			if (((i % a) == 0) && ((i % b) == 0)) {
				System.out.print("FizzBuzz\t");
			} else if ((i % a) == 0) {
				System.out.print("Fizz\t");
			} else if ((i % b) == 0) {
				System.out.print("Buzz\t");
			} else {
				System.out.print(i + "\t");
			}
			if ((i % 10) == 0) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("---Schicker---");

		for (int i = 1; i < 100; i++) {

			String output = "";

			if ((i % a) == 0) {
				output += "Fizz";
			}
			if ((i % b) == 0) {
				output += "Buzz";
			}

			if (output.equals("")) {
				System.out.print(i);
			}

			if ((i % 10) == 0) {
				System.out.println("");
			}

			System.out.print(output + "   ");
		}

	}

}
