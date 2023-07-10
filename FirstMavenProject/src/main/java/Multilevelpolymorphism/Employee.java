package Multilevelpolymorphism;

public class Employee {
int basicsalary=6000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee obj=new Employee();
System.out.println(obj.basicsalary);
obj.display();
	}
public void display() {
	System.out.println("Method is calling");
}
}
