package lab5;

public class Instructor extends Person{
	
	private int salary;

	public Instructor(String name, int birth, int salary){
		super(name,birth);
		this.salary = salary;
	}
	
	public String toString(){
		return "Instructor[super="+super.toString()+",salary="+(double)salary+"]";
	}
}
