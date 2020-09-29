public class Hello{
	public static void main(String args[]){
			System.out.println("Hello world");
		System.out.println("Second modify");
	}
}
class Person{
private String name;
private int age;
private char gender;

public Person(){
}
public Person(String name, int age, char gender){
	this.name=name;
	this.age=age;
	this.gender=gender;
}	
public String getName(){
	return this.name;
}
public void setName(String name){
	this.name=name;
}



}

