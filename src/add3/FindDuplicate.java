package add3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		int i;
		List<String>list=new LinkedList<String>();
		for(i=0;i<=10;i++)
		{
			list.add(String.valueOf(i));
		}
		for( i=0;i<=5;i++)
		{
			list.add(String.valueOf(i));
		}
		System.out.println("My list is:"+list);
		System.out.println("Duplicate values are:"+findDuplicates(list));
		}
	public static Set<String>findDuplicates(List<String>listContainsDuplicates)
	{
		final Set<String>set1=new HashSet<String>();
		final Set<String>set2=new HashSet<String>();
		for(String yourInt:listContainsDuplicates)
		{
			if(!set1.add(yourInt))
			{
				set2.add(yourInt);
			}
		}
		return set2;
	}
}


