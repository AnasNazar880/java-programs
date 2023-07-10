package PolymorphismEg1;

public class Splender extends Bike{
void run() {
	System.out.println(" running safely with 60km per hour");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b=new Splender();//up casting  
b.run();
	}

}
