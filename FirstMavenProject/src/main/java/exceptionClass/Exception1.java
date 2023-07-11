package exceptionClass;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//java.lang.ArrayIndexOutOfBoundsException
int b[]= {1,2,3,4};
try {
System.out.println(b[5]);
}
catch(ArrayIndexOutOfBoundsException i) {
	System.out.println(b[3]);
}
String s=null;
try {
	System.out.println(s.charAt(0));
}
catch(NullPointerException e ) {
	System.out.println("test catch block");
}
finally {
	System.out.println("print final block");
}	
}
	}


