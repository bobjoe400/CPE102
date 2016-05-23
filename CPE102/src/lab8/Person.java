package lab8;

public class Person implements Comparable{
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int compareTo(Object p){
		Person other = (Person) p;
		String oName = other.getName();
		return this.name.compareTo(oName);
	}
	
	public String toString(){
		return "Person[name="+name+"]";
	}
}
