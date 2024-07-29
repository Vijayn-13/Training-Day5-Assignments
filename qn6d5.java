import java.util.*;
public class qn6d5
{
    static void hashset(Integer[] a1,Integer[] a2){
        Set<Integer> a=new HashSet<>();
		a.addAll(Arrays.asList(a1));
		Set<Integer> b=new HashSet<>();
		b.addAll(Arrays.asList(a2));
		System.out.print("\nUsing HashSet: ");
		if(a.containsAll(b)){
		    System.out.println("B is a subset of A");
		}
		else if(b.containsAll(a)){
		    System.out.println("A is a subset of B");
		}
		else{
		    System.out.println("Both are not a subset of each other");
		}
    }
    
    static void linkedhashset(Integer[] a1,Integer[] a2){
        Set<Integer> a=new LinkedHashSet<>();
		a.addAll(Arrays.asList(a1));
		Set<Integer> b=new LinkedHashSet<>();
		b.addAll(Arrays.asList(a2));
		System.out.print("\nUsing LinkedHashSet: ");
		if(a.containsAll(b)){
		    System.out.println("B is a subset of A");
		}
		else if(b.containsAll(a)){
		    System.out.println("A is a subset of B");
		}
		else{
		    System.out.println("Both are not a subset of each other");
		}
    }
    
    static void treeset(Integer[] a1,Integer[] a2){
        Set<Integer> a=new TreeSet<>();
		a.addAll(Arrays.asList(a1));
		Set<Integer> b=new TreeSet<>();
		b.addAll(Arrays.asList(a2));
		System.out.print("\nUsing TreeSet: ");
		if(a.containsAll(b)){
		    System.out.println("B is a subset of A");
		}
		else if(b.containsAll(a)){
		    System.out.println("A is a subset of B");
		}
		else{
		    System.out.println("Both are not a subset of each other");
		}
    }
    
	public static void main(String[] args) {
		Integer[] a1={1,2,3};
		Integer[] a2={1,2,3,4};
		hashset(a1,a2);
		linkedhashset(a1,a2);
		treeset(a1,a2);
	}
}