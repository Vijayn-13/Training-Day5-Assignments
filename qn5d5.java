import java.util.*;
class Person{
	String name;
    	int age;
    	
    	Person(String str,int n){
        	this.name=str;
        	this.age=n;
    	}
    
   	public boolean equals(HashSet<Person> hs,Person p){
        	if(hs.contains(p)){
            		return true;
        	}
        	return false;
    	}
    
    	public int Hashcode(HashSet hs){
        	return hs.hashCode();
    	}
}
public class qn5d5
{
    
	public static void main(String[] args) {
		Person p1=new Person("Alice",30);
		Person p2=new Person("Bob",25);
		HashSet<Person> hs=new HashSet<>();
		hs.add(p1);
		hs.add(p2);
		System.out.println("Hashcode of hashset: "+p1.Hashcode(hs));
		boolean br=p1.equals(hs,p1);
		if(br==true){
		    System.out.println("Person(\"Alice\", 30) is in the set");
		}
		else{
		    System.out.println("Person(\"Alice\", 30) is not in the set");
		}
	}
}