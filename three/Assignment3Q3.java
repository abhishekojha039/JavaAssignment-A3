package assignment.three;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("56");
	      aList.add("77");
	      aList.add("21");
	      aList.add("6");
	      aList.add("547");
	      ListIterator<String> li = aList.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }

	}

}
