package SuperKeyword;
//super is used to refer immediate parent class instance variable.
public class Dog extends Animal {
	void printColor(){ 
		String colour="black"; 
		System.out.println(colour);//prints color of Dog class  
		System.out.println(super.colour);//prints color of Animal class  
		}  



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printColor();  
		
		}  
	
	}

