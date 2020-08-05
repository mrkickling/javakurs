public class Person {
	private String name;
	private int age;
	
	public Person(String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	public void sayHi() {
		System.out.println("Jag heter " + name + " och  är " + age + " år gammal");
	}
}
