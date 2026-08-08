import java.util.*;
public class insert
{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(23);
		list.add(55);
		list.add(62);
		 System.out.println("before insert:"+list);

		 list.add(23);
		 System.out.println("after insert:"+list);

		 list.remove(2);
		 System.out.println(list);
	}
}