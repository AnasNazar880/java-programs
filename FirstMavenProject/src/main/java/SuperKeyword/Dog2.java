package SuperKeyword;
//super is used to invoke parent class constructor.
public class Dog2 extends Animal2 {
	Dog2(){
		super();//super() is added in each class constructor automatically by compiler if there is no super() 
		System.out.println("Dog is created");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Dog2 d=new Dog2();
		}

	}


