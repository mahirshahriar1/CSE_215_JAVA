package lab18;

import java.io.ObjectInputStream.GetField;

public class test1 {
	public static void main(String[] args)
	{
		UnsortedArray<Integer> list=new UnsortedArray<Integer>();
		list.insertItem(5);
		list.insertItem(7);
		list.insertItem(6);
		list.insertItem(9);
		
		System.out.println(list.lengthis());
		list.insertItem(1);
		
		for(int i=0;i<list.lengthis();i++)
		{
			System.out.print(list.getNextItem()+" ");
		}
		System.out.println();

		if(list.retriveItem(4))
			System.out.println("Item is found");
		else
			System.out.println("Item is not found");

		if(list.retriveItem(5))
			System.out.println("Item is found");
		else
			System.out.println("Item is not found");

		if(list.retriveItem(9))
			System.out.println("Item is found");
		else
			System.out.println("Item is not found");

		if(list.retriveItem(10))
			System.out.println("Item is found");
		else
			System.out.println("Item is not found");
		
		if(list.isFull())
			System.out.println("List is full");
		else
			System.out.println("List is not full");
		
		list.deleteItem(5);
		
		if(list.isFull())
			System.out.println("List is full");
		else
			System.out.println("List is not full");
		
		list.deleteItem(1);
		for(int i=0;i<list.lengthis();i++)
		{
			System.out.print(list.getNextItem()+" ");
		}
		System.out.println();
		
		list.deleteItem(6);
		for(int i=0;i<list.lengthis();i++)
		{
			System.out.print(list.getNextItem()+" ");
		}
		System.out.println();
		
		
		UnsortedArray<studentInfo> list2=new UnsortedArray<studentInfo>();
		
		list2.insertItem(new studentInfo(15234, "Jon", 2.6));
		list2.insertItem(new studentInfo(13732, "Tyrion", 3.9));
		list2.insertItem(new studentInfo(13569, "Sandor", 1.2));
		list2.insertItem(new studentInfo(15467, "Ramsey", 3.1));
		list2.insertItem(new studentInfo(16285, "Arya", 3.1));
		
		for(int i=0;i<list2.lengthis();i++)
		{
			studentInfo temp=list2.getNextItem();
			if(temp.getID()==15467)
			{
				list2.deleteItem(temp);
				list2.resetList();
				break;
			}
		}
		studentInfo temp2=new studentInfo(13569,"Sandor", 1.2);
		
		if(list2.retriveItem(temp2))
			System.out.println("Item is found");
		else
			System.out.println("Item is not found");
	
		
		System.out.println();
		
		for(int i=0;i<list2.lengthis();i++)
		{
			System.out.print(list2.getNextItem().toString()+"\n");
		}
		System.out.println();

		
		
	}
}
