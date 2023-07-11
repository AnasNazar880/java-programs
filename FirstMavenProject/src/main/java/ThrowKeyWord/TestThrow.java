package ThrowKeyWord;

public class TestThrow {
public static void validate(int age) {
	if(age<18) {
		//throw arithematic exception if the person is not eligible to vote
		throw new ArithmeticException("the person is not eligilble to vote");
	} 
	else {
		System.out.println("the person is eligile for vote");
	}
}
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
validate(13);
System.out.println("the rest of the code");
	}

}
