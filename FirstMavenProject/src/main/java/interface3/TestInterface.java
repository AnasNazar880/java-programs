package interface3;
//interface inheritance
public class TestInterface implements Showable {
public void print() {
	System.out.println("My wife is beautiful");
}
public void Show() {
	System.out.println("i am showing my kids to the world");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestInterface obj=new TestInterface();
obj.print();
obj.Show();
	}

}
