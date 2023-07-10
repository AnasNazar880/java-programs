package interface1;
//Implementation: by second user  
public class Circle implements Drawable {
	public void draw() {
	System.out.println("Circle is drawing");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable obj=new Rectangle();
Drawable obj1=new Circle();//important
obj.draw();
obj1.draw();
}
}
