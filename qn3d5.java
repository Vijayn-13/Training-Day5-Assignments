import java.util.*;
public class qn3d5
{
    
    static int linkedhashset(Integer[] arr){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.addAll(Arrays.asList(arr));
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(arr));
        for(Integer i:lhs){
            if(list.indexOf(i)==list.lastIndexOf(i)){
                return i;
            }
        }
        return -1;
    }
    
    
	public static void main(String[] args) {
		Integer[] arr= {4, 5, 6, 4, 7, 8, 5};
		System.out.println("Input array: "+Arrays.asList(arr));
		int n=linkedhashset(arr);
		if(n!=-1){
		    System.out.println("First non-duplicate element using linkedhashset function: "+n);
		}
		else{
		    System.out.println("Non-duplicate element not found");
		}
	}
}