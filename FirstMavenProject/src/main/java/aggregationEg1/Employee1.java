package aggregationEg1;

public class Employee1 {
int id;
String name;
EmpAddress address;

	public Employee1(int id, String name, EmpAddress address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
	public void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee city:"+address.city);
		System.out.println("Employee country:"+address.country);
		System.out.println("Employee zipcode:"+address.zipcode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpAddress obj=new EmpAddress("TRIVANDRUM","INDIA","KERALA",6754);
Employee1 obj1=new Employee1(123,"ANAS",obj);
obj1.display();
	}

}
