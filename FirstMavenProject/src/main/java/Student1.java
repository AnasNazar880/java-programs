
public class Student1{
	
		int id;
		String name;
		String Course;
		float fee;
		
		void Student(int id,String name,String course){
			this.id=id;
			this.name=name;
			this.course=course;
			
			
		}
		void Student1(int id,String name,String course,float fee){
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
			Student s1=new Student1(123,"ANJISH","ENGINEERING");
			s1.display();
			Student1 s2=new Student1(122,"Anas","MBBS",16.875f);
			s2.display();
			
		}
	}


