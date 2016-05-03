package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	
	private static ArrayList<StudentO> book;
	
	public static void main(String[] args){
		book = new ArrayList<StudentO>();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("Enter a student name, Q to quit:");
			String input = in.nextLine();
			if(input.equalsIgnoreCase("q")) break;
			book.add(new StudentO(input));
		}
		for(StudentO s: book){
			System.out.println("Enter scores for "+s.getName()+", Q to quit:");
			String[] input = in.nextLine().split(" ");
			double min = Double.MAX_VALUE;
			int skip = 0;
			for(int i = 0; i < input.length -1; i++){
				if(Double.parseDouble(input[i]) < min){
					min = Double.parseDouble(input[i]);
					skip = i;
				}
			}
			for(int i = 0; i < input.length - 1; i++){
				if(i == skip) continue;
				s.addGrade(Double.parseDouble(input[i]));
			}
		}
		for(StudentO s: book){
			System.out.println(s);
		}
		in.close();
	}
}
