package application;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Student;

public class ProgramLinkedHashSet {

	public static void main(String[] args) {

		System.out.println("A Student can be enrolled in more than one course.");
		Set<Student> math = new LinkedHashSet<Student>();
		Set<Student> science = new LinkedHashSet<Student>();
		Set<Student> algorithm = new LinkedHashSet<Student>();
		Set<Student> total = new LinkedHashSet<Student>();

		math.add(new Student("Rafael"));
		math.add(new Student("Juliana"));
		math.add(new Student("Claudia"));
		math.add(new Student("Larissa"));
		math.add(new Student("Marcus"));

		science.add(new Student("Rafael"));
		science.add(new Student("DeLuca"));
		science.add(new Student("Laura"));

		algorithm.add(new Student("Laura"));
		algorithm.add(new Student("Augusto"));
		algorithm.add(new Student("Rafael"));

		total.addAll(math);
		total.addAll(science);
		total.addAll(algorithm);

		System.out.println("Total number of students are " + total.size());
		
		int studentPerCourse = math.size() + science.size() + algorithm.size(); 
		System.out.println("Total number of students enrolled in each course: " +studentPerCourse  );
		System.out.println("\nStudents of math");
		for (Student nickname : math) {
			System.out.println(nickname);
		}
		System.out.println("\nStudents of science");
		for (Student nickname : science) {
			System.out.println(nickname);
		}
		System.out.println("\nStudents of algorithm");
		for (Student nickname : algorithm) {
			System.out.println(nickname);
		}

	}

}
