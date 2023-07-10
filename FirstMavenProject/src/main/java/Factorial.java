
public class Factorial {
	int num=9,fact=1;
	 public static int Factorialcalc(int num) {
		    int fact = 1;
		    for (int i = 1; i <= num; i++) {
		      //fact *= i
			  fact=fact*i;
		    }
		    return fact;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
obj.display();
	}
public void display() {
	

if (num < 0) {
    System.out.println("Not Valid!");
  } else 
    fact = Factorialcalc(num);
    System.out.println("the factorial for " + num + " is " + fact + ".");}
}