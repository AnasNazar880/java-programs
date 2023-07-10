package aggregationEg3;

public class Student {
String name;
int id;
Address addres;

public Student(String name, int id, Address addres) {
	super();
	this.name = name;
	this.id = id;
	this.addres = addres;
}
void display() {
	System.out.println("Student name:"+name);
	System.out.println("Studemt id:"+id);
	System.out.println("country:"+addres.Country);
	System.out.println("state:"+addres.state);
	System.out.println("place:"+addres.place);
	System.out.println("house no:"+addres.housenumber);
}
public static void main(String args[]) {
	Address obj=new Address("india","kerala","Trivandrum",124);
	Student obj1=new Student("ANAS",678943,obj);
	obj1.display();
}}