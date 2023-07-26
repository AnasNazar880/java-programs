package collectionsEg;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("apple");
		fruits.add("Orange");
		fruits.add("pinapple");
		Iterator itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
