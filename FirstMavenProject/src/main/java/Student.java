
public class Student {
int id;
String name,course;
float fee;

	public Student(int id, String name, String course) {
	
	this.id = id;
	this.name = name;
	this.course = course;
}
	

	public Student(int id, String name, String course, float fee) {
	
this( id,name,course);
		this.fee = fee;
	}

void display(){
//System.out.println("id="+id+"\nname="+name+"\ncourse="+course);
System.out.println("id="+id+"\nname="+name+"\ncourse="+course+"\nfee="+fee);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(111,"anas","degree");
s1.display();
Student s2=new Student(121,"Biju","plustwo",1200.54f);
s2.display();
	}

}
