
public class Average {
int a,b,c;
float d,e,f;
	public void Average(int a, int b, int c) {
//method overloading
	System.out.println("the average of 3 integers is ="+(a+b+c)/3);
	
}
	public void Average(float d,float e,float f) {
		System.out.println("the average of 3 float number is ="+(c+d+f)/3.0f);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Average a1=new Average();
a1.Average(10,12,14);
a1.Average(5.04f,6.47f,4.25f);
	}

}

