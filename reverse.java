import java.util.*;
public class reverse{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(44);
		list.add(22);

		Collections.reverse(list);
		System.out.println(list);
	}
}