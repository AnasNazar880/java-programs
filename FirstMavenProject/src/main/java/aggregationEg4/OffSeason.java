package aggregationEg4;
 import java.util.Scanner;
public class OffSeason {
static double discounts=0.15f;
public static void discount(double cost) {
System.out.println("in off-season,the goods will be available at 15%discount:"+cost*discounts );	
System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the total cost of the products:" );
double cost=sc.nextDouble();
OnSeason.discount(cost);
OffSeason.discount(cost);
	}
}
