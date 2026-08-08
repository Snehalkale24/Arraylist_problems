import java.util.*;
public class negative{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(-12);
		list.add(-54);
		list.add(8);

		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<0)
			{
				System.out.println("negative no:"+list.get(i));
			}
		}
	}
}