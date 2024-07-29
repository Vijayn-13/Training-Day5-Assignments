import java.util.*;
public class qn1d5
{
    static HashSet hashset(Integer[] arr){
        HashSet<Integer> hs=new HashSet<>(Arrays.asList(arr));
        return hs;
    }
    
    static LinkedHashSet linkedhashset(Integer[] arr){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.addAll(Arrays.asList(arr));
        return lhs;
    }
    
    static TreeSet treeset(Integer[] arr){
        TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(arr));
        return ts;
    }
    
	public static void main(String[] args) {
		Integer[] arr={5,3,5,1,2};
		System.out.println("Input array: "+Arrays.asList(arr));
		System.out.println("Array after performing hashset function: "+hashset(arr));
		System.out.println("Array after performing linkedhashset function: "+linkedhashset(arr));
		System.out.println("Array after performing treeset function: "+treeset(arr));
	}
}