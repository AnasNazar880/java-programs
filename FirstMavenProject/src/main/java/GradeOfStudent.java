
public class GradeOfStudent {
	int maths,chem,phy;
	int  sum;
	
	GradeOfStudent(int maths,int chem,int phy) {
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
		
	}
	public void getgrade(){
		int sum= TotalMark();
		if(sum<=300&&sum>=240) {
			System.out.println("ANAS got A grade");
		}
		else if (sum<=230&&sum>=186) {
			System.out.println("BIJU got B grade");}
		else 
		{
		System.out.println("Hari failed in the exam");
			}
	}
	public  int TotalMark() {
		
		return maths+chem+phy;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GradeOfStudent g1=new GradeOfStudent(58,68,85);
g1.TotalMark();
g1.getgrade();
GradeOfStudent f1=new GradeOfStudent(89,80,95);
f1.TotalMark();
f1.getgrade();
GradeOfStudent h1=new GradeOfStudent(40,20,25);
h1.TotalMark();
h1.getgrade();
//GradeOfStudent sum=new GradeOfstudent();


}
}


