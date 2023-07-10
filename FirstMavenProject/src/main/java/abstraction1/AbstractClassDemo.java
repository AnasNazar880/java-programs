package abstraction1;

public abstract class AbstractClassDemo extends Employee{

	public AbstractClassDemo(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj =new Contractor("contractor",10,10);
Employee obj1=new FullTimeEmployee("Employee",8);
System.out.println(obj.calculateSalary());
System.out.println(obj1.calculateSalary());
	}

}
