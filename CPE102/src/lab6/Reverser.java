package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverser {
	
	private ArrayList<String> data;
	
	public Reverser(File file){
		data = new ArrayList<String>();
		Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(in.hasNextLine()){
			data.add(in.nextLine());
		}
		in.close();
		file.delete();
	}
	
	public void getReverse(){
		File f = new File("input.txt");
		try{
			PrintWriter pr = new PrintWriter(f);
			for(String s: data){
				String rev = "";
				for(int i = s.length()-1; i >= 0; i--){
					rev+=s.charAt(i);
				 }
				pr.write(rev);
				pr.write("\n");
			}
			pr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
