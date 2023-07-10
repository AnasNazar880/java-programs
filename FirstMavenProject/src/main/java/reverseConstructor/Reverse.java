package reverseConstructor;

public class Reverse {
int num;
int rev=0,reminder;
Reverse(int num){
	this.num=num;
	while(num!=0)//the while loop will execute till the number not become 0
	{
		reminder=num%10;
		rev= rev*10+reminder;
		num=num/10;}
}
void display(){
	System.out.println("The reverse of the given number is : " +rev);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reverse obj=new Reverse(345);
obj.display();
	}
}
