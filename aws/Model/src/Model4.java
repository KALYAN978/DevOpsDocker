
public class Model4 {
	
	public static void displayPerson(Person person) {
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("anjan",30);
		displayPerson(person);
		
		
		
		

	}

}
