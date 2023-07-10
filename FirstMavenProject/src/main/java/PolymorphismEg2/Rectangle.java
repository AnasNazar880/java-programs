package PolymorphismEg2;

public class Rectangle extends Shapes{

	void draw() {
		System.out.println("...Drawing Rectangle ...");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Shapes s;
	s=new Circle();
	s.draw();
	s=new Triangle();
	s.draw();
	s=new Rectangle();
	s.draw();

		}

	}