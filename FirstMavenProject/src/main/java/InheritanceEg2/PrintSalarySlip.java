package InheritanceEg2;

public class PrintSalarySlip extends Employee{
	PrintSalarySlip(double basicpay,double deductions,double bonus){
		super(basicpay,deductions,bonus);
		}
	void salarySlip() {
		System.out.println("basic pay:"+getbasicpay());
		System.out.println("deductions:"+getdeduction());
		System.out.println("bonus:"+getbonus());
		System.out.println("HRA:"+calculateHRA());
		System.out.println("PF:"+calculatePF());
		System.out.println("TOTAL SALARY BY hand:"+(getbasicpay()-calculatePF()+getbonus()+calculateHRA()-getdeduction()));
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintSalarySlip s=new PrintSalarySlip(8000,500,1000);
s.salarySlip();
	}

}
