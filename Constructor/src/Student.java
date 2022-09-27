
public class Student {
	
	
	private String name;
	private String surname;
	private int age;
	private String id;
	private String classroom= "4th";
	private String gender;
	
	public String getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
public Student(String name, String surname, int age) {
	this.name=name;
	this.surname=surname;
	this.age=age;
}
	
	

}
