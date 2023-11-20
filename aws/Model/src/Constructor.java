
public class Constructor {
	
	int id;
	String name;
	int age;
	
	Constructor(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		Constructor cons = new Constructor(1, "kaala", 0);

		cons.display();
	}

}
