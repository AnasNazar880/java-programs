package abstractclass1;

public class Circle extends Shapes{
void draw() 
{
	System.out.println("Circle is drawing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shapes s=new Circle();
s.draw();
	}

}
