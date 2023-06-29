package application;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {

			Set<String> math = new HashSet<>();
			Set<String> science = new HashSet<>();

			System.out.println("Enter the number of the students and after the names of the students.");
			System.out.print("How many students for math course?");
			int numberOfStudents = input.nextInt();
			input.nextLine();
			for (int i = 0; i < numberOfStudents; i++) {
				String nome = input.nextLine();
				math.add(nome);
			}

			System.out.print("How many stydents for science course?");
			numberOfStudents = input.nextInt();
			input.nextLine();
			for (int i = 0; i < numberOfStudents; i++) {
				String name = input.nextLine();
				science.add(name);
			}
			System.out.println("-----------------");
			System.out.println("Those are students of math course:");
			for (String nickname : math) {
				System.out.println(nickname);
			}
			System.out.println("-----------------");
			System.out.println("Those are students of science course");
			for (String nickname : science) {
				System.out.println(nickname);
			}

			Set<String> total = new HashSet<String>();
			total.addAll(math);
			total.addAll(science);

			System.out.println();
			System.out.println("The number os students of the school  " + total.size() + ". And they are: ");

			for (String nickname : total) {
				System.out.println(nickname);

			}
		} catch (InputMismatchException typeError) {
			System.out.println("You did not inform a STRING");
			typeError.printStackTrace();

		}

		input.close();
	}

}
