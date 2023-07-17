package thrownKeyWord;

public class TestThrows {
	 //defining a method
public static int divideNum(int m, int n)throws ArithmeticException {
	int div=m/n;
	return div;
}
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestThrows obj=new TestThrows();
try {
	System.out.println(obj.divideNum(45,0));	
}
catch(ArithmeticException e){
	System.out.println("\n the number is not divisible by zero");
}
System.out.println("print the rest of the code");
	}

}
