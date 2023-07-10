package encapsulationEg2;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bank=new Bank();
User user=new User();
user.setPin1(1234);

if(bank.validatePin(user.getPin1())) {
	System.out.println("valid pin");
}
else {
	System.out.println("invalid pin");
	}

}}
