
public class AverageConstructor {
	int a,b,c;
	float d,e,f;
		 AverageConstructor(int a1,int b1, int c1) {
		  a=a1;
		  b=b1;
		  c=c1;
		 }
		
		 void display(){
			 
			System.out.println("the sum of 3 integers is ="+(a+b+c));		
		 }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageConstructor d1=new AverageConstructor(25,28,39);
		d1.display();
		

}}
