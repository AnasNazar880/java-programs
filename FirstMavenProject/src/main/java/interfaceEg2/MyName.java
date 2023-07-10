package interfaceEg2;
//multiple inheritance through interface
public class MyName implements Printable,Showable {
public void print() {
	System.out.println("i am printing my name");
	}
public void show() {
	System.out.println("i am showing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyName obj=new MyName();//object creation is done using class only
obj.show();
obj.print();
	}

}
//here printable and Showable are two interfaces ,we connect these two interface with a single class