package AggregationEg2;

public class Circle {
	
	Operation op;
	double pi=3.14;
	double area(int radius) {
		op= new Operation();
		int rssquare=op.square(radius);
		//code re usability (i.e. delegates the method call). 
		return pi*rssquare;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Circle c=new Circle();
	double result=c.area(5);
	System.out.println(result);
		}
}
