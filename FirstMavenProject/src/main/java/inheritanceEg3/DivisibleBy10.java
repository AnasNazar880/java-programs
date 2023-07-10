package inheritanceEg3;

public class DivisibleBy10 extends AddNumber{
public boolean divisible(int a ,int b) {
	return super.add(a,b)%10==0;
}
	public static void main(String[] args) {
		// TODO Auto-generated metho,d stub
DivisibleBy10 obj=new DivisibleBy10();

System.out.println( obj.divisible(8,12));

	}}

