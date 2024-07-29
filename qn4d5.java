import java.util.*;
public class qn4d5
{
    
    static TreeSet treeset(Integer[] arr){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.addAll(Arrays.asList(arr));
        return ts;
    }
    
    
	public static void main(String[] args) {
		Integer[] arr= {7, 2, 9, 1, 2, 9};
		System.out.println("Input array: "+Arrays.asList(arr));
		System.out.println("Unique elements sorted in ascending order using TreeSet: "+treeset(arr));
	}
}