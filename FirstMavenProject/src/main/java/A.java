
public class A {
A(){
	System.out.println("default constructor");
}
A(int n){
	this();
	System.out.println(n);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A(10);
		

	}

}
