package Multilevelpolymorphism;

public class HrManager extends Manager {
int totalsalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HrManager obj=new HrManager();
obj.totalsalary=obj.hra+obj.basicsalary;
System.out.println("The total salary of HR IS:"+obj.totalsalary );
System.out.println(obj.hra);
System.out.println(obj.basicsalary);

	}

}
