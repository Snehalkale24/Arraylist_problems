import java.util.*;
public class duplicate{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(32);
		list.add(12);

		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					System.out.print(list.get(i));
				}
			}
		}
	}
}