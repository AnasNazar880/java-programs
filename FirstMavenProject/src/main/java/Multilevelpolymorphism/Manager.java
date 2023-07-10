package Multilevelpolymorphism;

public class Manager extends Employee{
int hra=1345;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager obj=new Manager();
System.out.println("The basic salary:"+obj.basicsalary);
System.out.println(obj.hra);
obj.display();
	}

}
