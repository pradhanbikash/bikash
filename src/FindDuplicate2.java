import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate2 {

	public static void main(String[] args) {
		Integer [] arrayOne={0,1,2,3,4,5,6,7,8,9};
		Integer[] arrayTwo={3,7,9,5};
		Set<Integer>set1=new HashSet<Integer>(Arrays.asList(arrayOne));
		Set<Integer>set2=new HashSet<Integer>(Arrays.asList(arrayTwo));
		for(Integer duplicate:set1)
		{
			if(!set2.add(duplicate))
				System.out.println("Duplicate value is:"+duplicate);
		}
	}

}
