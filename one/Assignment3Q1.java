package asssignment.one;

import java.util.TreeSet;
import java.util.Comparator;

class Person{
    private String name;
    private int weight;
    private double height;
    public Person(String n, int s){
        this.name = n;
        this.weight = s;
    }
    
    public String getName()
    {
    	return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight()
    {
    	return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString(){
        return "Name: "+this.name+" Weight: "+this.weight;
    }
}

class Comp implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}

class weight implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2)
	{
		if(p1.getWeight()>p2.getWeight())
			return 1;
		else
			return -1;
	}
}

public class Assignment3Q1 {

	public static void main(String[] args) {
		
		TreeSet<Person> per = new TreeSet<Person>(new weight());
		per.add(new Person("Ram",66));
		per.add(new Person("SHyam",57));
		per.add(new Person("Lucky",70));
		per.add(new Person("Avi",56));
		per.add(new Person("Rahul",55));
		per.add(new Person("Rashmi",62));
		for(Person p:per)
			System.out.println(p);
		

	}

}
