package polymorphismEg4;

public class AxisBank extends Bank {
float getRateOfInterest() {
	return 9.8f;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b;
b= new Sbi();
System.out.println("Sbi rate of interest is:"+b.getRateOfInterest());
b=new Icici();
System.out.println("ICICI rate of interest is:"+b.getRateOfInterest());
b=new AxisBank();
System.out.println("Axis Bank rate of interest is:"+b.getRateOfInterest());

	}

}
