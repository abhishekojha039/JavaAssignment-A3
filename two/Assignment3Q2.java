package assignment.two;

import java.util.HashSet;  
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment3Q2 {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet();   
        h.add("Apple");      
        h.add("Banana");      
        h.add("Cat");     
        h.add("Dog");    
        h.add("Elephant");  
        Iterator<String> i=h.iterator();    
        while(i.hasNext()) 
        {    
        System.out.println("HASH SET: "+i.next());    
        }    
        
        LinkedHashSet<String> lh=new LinkedHashSet();   
        lh.add("Apple");    
        lh.add("Banana");      
        lh.add("Cat");     
        lh.add("Dog");    
        lh.add("Elephant");    
        Iterator<String> j=lh.iterator(); 
        while(j.hasNext())   
        {    
        System.out.println("LINKED HASH SET: "+j.next());  
        }    

	}

}
