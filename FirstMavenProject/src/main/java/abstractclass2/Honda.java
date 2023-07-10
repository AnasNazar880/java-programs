package abstractclass2;

public class Honda extends Bike{
void run() {
	System.out.println("running safely");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj=new Honda();
obj.run();
obj.gearChange();

	}

}
