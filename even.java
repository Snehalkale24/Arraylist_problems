import java.util.*;
public class even
{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(14);
		list.add(19);
		list.add(15);

		for(int i=0;i<list.size();i++){
			if(list.get(i)%2==0)
			{
				System.out.println("even:"+list.get(i));
			}
		}
	}
}