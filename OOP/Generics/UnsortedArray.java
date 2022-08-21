package lab18;

public class UnsortedArray<E> {
	private final static int MAX_ITEMS=5;
	private int length,currentPos;
	E[] info= (E[]) new Object[MAX_ITEMS];
	
	public UnsortedArray() {
		this.length=0;
		this.currentPos=-1;
	}
	
	public void makeEmpty()
	{
		this.length=0;
		this.currentPos=-1;
	}
	public boolean isFull()
	{
		return (length==MAX_ITEMS);
	}
	public int lengthis()
	{
		return length;
	}
	public void resetList()
	{
		this.currentPos=-1;
	}
	
	public void insertItem(E item)
	{
		if(length==MAX_ITEMS)
		{
			System.out.println("Array is full");
		}
		else{
			info[length++]=item;
		}
	}
	public void deleteItem(E item)
	{
		int ind=-1;
		for(int i=0;i<length;i++)
		{
			if(item==info[i])
			{
				ind=i;
				break;
			}
		}
		if(ind>=0)
		{
			for(int j=ind;j<length-1;j++)
			{
				info[j]=info[j+1];
			}
			length--;
			currentPos=-1;
		}
	}
	public E getNextItem()
	{
		if(currentPos==4)
			resetList();
		return info[++currentPos];
	}
	public boolean retriveItem(E item)
	{
		for(int i=0;i<length;i++)
		{
			if(item.toString().equals(info[i].toString()))
			{
				return true;
			}
		}
		return false;
	}
	
}
