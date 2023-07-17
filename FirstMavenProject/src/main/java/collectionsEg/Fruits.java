package collectionsEg;
import java.util.ArrayList;
public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>fruits=new ArrayList<String>();
fruits.add("Mango");
fruits.add("Orange");
System.out.println(fruits);
ArrayList<String>vegitables=new ArrayList<String>();
vegitables.add("potato");
vegitables.add("lady finger");
System.out.println(vegitables);
Fruits.addAll(vegitables);
System.out.println(fruits);
fruits.add(1,"pinapple");//1 st index specified adding object
System.out.println(fruits);
Fruits.addAll(2,vegitables);
//System.out.println(Fruits);
System.out.println("Returning element:"+fruits.get(1));
fruits.set(1,"grapes");
System.out.println(fruits);

System.out.println(fruits.remove(2));
System.out.println(fruits.remove("Mango")); //boolean if it is removed shows true
System.out.println(fruits.isEmpty());
System.out.println(fruits.lastIndexOf("Orange"));
for (String f:fruits) {
	System.out.println(f);
}
Collections.sort(fruits);
System.out.println(fruits);
Iterator itr=Fruits.iterator();//getting the iterator
while(itr.hasNext()) {//check if iterator has the element
	System.out.println(itr.next());//printing the  elementsand move to next
}
HashSet<integer>
	}

}
