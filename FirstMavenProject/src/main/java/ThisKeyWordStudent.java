
public class ThisKeyWordStudent {
	int id;
	String name;
	String Course;
	float fee;
	
	void ThisKeyWordStudent(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
		
		
	}
	void ThisKeyWordStudent(int id,String name,String course,float fee){
		this.id=id;
		this.name=name;
		this.course=course;
	    this.fee=fee;
	}
	void display(){
		System.out.println("id="+id+"\nname="+name+"\ncourse="+course);
		System.out.println("id="+id+"\nname="+name+"\ncourse="+course+"\nfee="+fee);
			//System.out.println("id="+id+"\nname="+name+"\ncourse="+course);
	}
	public static void main(String args[]){
		ThisKeyWordStudent s1=new ThisKeyWordStudent(123,"ANJISH","ENGINEERING");
		s1.display();
		ThisKeyWordStudent s2=new ThisKeyWordStudent(122,"Anas","MBBS",16.875f);
		s2.display();
		
	}
}
