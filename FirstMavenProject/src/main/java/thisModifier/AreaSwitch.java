package thisModifier;
import java.util.Scanner;

class AreaSwitch {
	int radius;
	int length,breadth;
	long side;
	
	 AreaSwitch(int radius)
	{
		this.radius=radius;}
		
        //System.out.println("Circle area="+3.14*radius*radius);}
	AreaSwitch(int length,int breadth){
		this.length=length;
		this.breadth=breadth;	
	}
	AreaSwitch(long side){
		this.side=side;
	}
	void display()
	{
		
		System.out.println("the area of circle is :"+(3.14*radius*radius));
		System.out.println("the area of rectangle is:"+(length*breadth));
		System.out.println("the area of square is:"+(side*side));
		
	}
	void getdetails() {
		 AreaSwitch r  =new AreaSwitch(radius);
		 r.display();
		 AreaSwitch p=new AreaSwitch(length,breadth);
		 p.display();
		 AreaSwitch q=new AreaSwitch(side);
		 r.display();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape of area to be finded:");
		System.out.println("a.circle");
		System.out.println("b.square");
		System.out.println("c.rectangle");
		int area=sc.nextInt();
		switch(Option) {
		case a:
			System.out.println("enter the radius of the circle");
			int radius=sc.nextInt();
			
			break;
		case b:System.out.println("enter the length of the rectangle");
		     int length=sc.nextInt();
		     
		     
		       System.out.println("enter the breadth of the rectangle");
		       int breadth=sc.nextInt();
		       
			break;
		case c:System.out.println("enter the side of the square");
		long side=sc.nextLong();
		 
		
			break;
			default;
		}
		
	}

}
