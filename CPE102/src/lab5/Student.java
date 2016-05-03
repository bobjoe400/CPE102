package lab5;

public class Student extends Person{
	
	private String major;
	
	public Student(String name, int birth, String major){
		super(name,birth);
		this.major = major;
	}
	
	public String toString(){
		return "Student[super="+super.toString()+",major="+major+"]";
	}
}
