package encapsulation;

public class Account {
private long acc_no;
private String name,email;
private float amount;
	public long getAcc_no() {
	return acc_no;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account obj=new Account();
obj.setName("anas");
obj.setEmail("anas@gmail.com");
obj.setAcc_no(1234455);
obj.setAmount(80000);
System.out.println(obj.getName()+"" +obj.getEmail()+ ""+obj.getAcc_no()+""+obj.getAmount());
	}
}
