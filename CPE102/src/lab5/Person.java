package lab5;

public class Person {

	private String name;
	private int birth;
	
	public Person(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	public String toString(){
		return "Person[name="+name+",birthYear="+birth+"]";
	}
}
