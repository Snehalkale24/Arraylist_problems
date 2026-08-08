import java.util.*;
public class odd
{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(13);
		 list.add(15);

		

		 for(int i=0;i<list.size();i++)
		 {
		 	if(list.get(i)%2!=0)
		 	{
                System.out.println("odd:"+list.get(i));

		 	}
		 }
		 	}
}