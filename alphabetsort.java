import java.util.*;
public class alphabetsort
{
	public static void main(String args[])
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("sanika");
		list.add("rahul");
		list.add("neha");

		System.out.println("before sorting:"+list);

		Collections.sort(list);
		System.out.println("after sortting:"+list);
	}
}