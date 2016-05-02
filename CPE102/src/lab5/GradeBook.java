package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	
	private static ArrayList<Student> book;
	
	public static void main(String[] args){
		book = new ArrayList<Student>();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("Enter a student name, Q to quit:");
			String input = in.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			book.add(new Student(input));
		}
		for(Student s: book){
			System.out.println("Enter scores for "+s.getName()+", Q to quit");
			String[] input = in.nextLine().split(" ");
			for(int i = 0; i < input.length -1; i++){
				s.addGrade(Double.parseDouble(input[i]));
			}
		}
		for(Student s: book){
			System.out.println(s);
		}
		in.close();
	}
}
