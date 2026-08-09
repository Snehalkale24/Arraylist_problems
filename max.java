// import java.util.*;
// public class max{
// 	public static void main(String args[])
// 	{
// 		ArrayList<Integer>list=new ArrayList<>();
// 		list.add(10);
// 		list.add(20);
// 		list.add(30);
// 		list.add(10);

// 		int max=list.get(0);


// 		for(int i=0;i<list.size();i++)
// 		{
// 		    if(list.get(i)>max)
// 		    {
// 		    	max=list.get(i);
// 		    }
// 		}
// 		System.out.println("max:"+max);
// 	}
// }

import java.util.*;
public class max
{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(44);

		int max=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)>max)
			{
				max=list.get(i);
			}
		}
		System.out.println("max:"+max);
	}
}