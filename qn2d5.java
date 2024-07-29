import java.util.*;
public class qn2d5
{
    
    static LinkedHashSet linkedhashset(String[] arr){
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.addAll(Arrays.asList(arr));
        return lhs;
    }
    
    
	public static void main(String[] args) {
		String[] arr= {"apple", "banana", "apple", "orange"};
		System.out.println("Input array: "+Arrays.asList(arr));
		System.out.println("Array after performing linkedhashset function: "+linkedhashset(arr));
	}
}