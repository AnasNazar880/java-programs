package SuperKeyword;
//super can be used to invoke parent class method
public class Dog1 extends Animal1 {
	void eat() {
		System.out.println("eating bread");
	}
	void bark() {
	System.out.println("...barking");
	}
	void work() {
		super.eat();
		bark();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.work();
	}

}

