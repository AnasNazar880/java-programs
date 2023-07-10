
package InheritanceEg2;
public class Employee {
double basicpay;
double deduction;
double bonus;
Employee(double basicpay,double deduction,double bonus){
	this.basicpay=basicpay;
	this.deduction=deduction;
	this.bonus=bonus;}	
	// TODO Auto-generated constructor stub

	double getbasicpay() {
		return basicpay;
	}
	double getdeduction() {
		return deduction;
	}
	double getbonus()
	{
		return bonus;
	}
	double calculatePF()
	{
		return 0.2*basicpay;
	}
	double calculateHRA() {
		return 0.05*basicpay;
	}
	
}

