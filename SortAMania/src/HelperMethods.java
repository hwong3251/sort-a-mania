import java.util.Arrays;

public abstract class HelperMethods {
	//merge
	public static String[]merge(String[]list1, String[]list2)
	{
		String[]newArr = new String[list1.length+list2.length];
		int i = 0;
		int j = 0;
		int x = 0;
		while(i < list1.length && j < list2.length)
		{
			if(list1[i].compareTo(list2[j]) < 0)
			{
				newArr[x]=list1[i];
				i++;
				x++;
			}
			else if(list1[i].compareTo(list2[j]) > 0)
			{
				newArr[x]=list2[j];
				j++;
				x++;
			}
			else if(list1[i].compareTo(list2[j]) == 0)
			{
				newArr[x] = list1[i];
				newArr[x+1] = list2[j];
				i++;
				j++;
				x+=2;
			}
		}
		if( i < list1.length)
		{
			for( int k = i;k < list1.length;k++)
			{
				newArr[x] = list1[k];
				x++;
			}
		}
		if( j < list2.length)
		{
			for( int k = j;k < list2.length;k++)
			{
				newArr[x] = list2[k];
				x++;
			}
		}
		return newArr;
	}
	//mergeSort
	public static String [] mergeSort(String [] list)
	{
		if(list.length == 1)
		{
			return list;
		}
		else
		{
			String[]a1 = Arrays.copyOfRange(list, 0, list.length/2);
			String[]a2 = Arrays.copyOfRange(list, list.length/2, list.length);
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
	}
	//partition
	public static int partition(int[]list,int front, int back)
	{
		int p = list[front];
		int l = front + 1;
		int r = back;
		while(l<r)
		{
			while(l<back&& list[l] < p)
			{
				l++;
			}
			while(r>front&& list[r] >= p)
			{
				r--;
			}
		}
		list[front] = list[r];
		list[r] = p;
		return p;
	}
	//insertion
	public static void insertionSort(int[]list1)
	{
		for ( int i = 0; i < list1.length; i++)
		{
			for ( int j=i; j> 0; j--)
			{
				if(list1[j] < list1[j-1])
				{
					swap(list1,j,j-1);
				}
			}
		}
	}
	//selection
	public static void selectionSort(double[]list1)
	{
		double min;
		int index = 0;
		for ( int j = 0; j < list1.length; j++)
		{
			min = list1[j];
			for ( int i=j; i < list1.length; i++)
			{
				if(list1[i] < min)
				{
					min = list1[i];
					index = i;
				}
			}
			swap(list1,index,j);
		}
	}
	//bubble
	public static void bubbleSort(String[]list1)
	{
		boolean swap = true;
		while(swap)
		{
			int count = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				if(list1[i].compareTo(list1[i+1])>0)
				{
					swap(list1,i+1,i);
					count++;
				}
			}
			if(count == 0)
			{
				swap = false;
			}
		}
	}
	public static void bubbleSort(int[]list1)
	{
		boolean swap = true;
		while(swap)
		{
			int count = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				if(list1[i]>list1[i+1])
				{
					swap(list1,i+1,i);
					count++;
				}
			}
			if(count == 0)
			{
				swap = false;
			}
		}
	}
	//swap
	public static void swap(String[]arr,int i,int j)
	{
		String n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
	public static void swap(double[]arr , int i, int j) 
	{
		double n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
	public static int getMedian(int[] arr)
	{
		int index = arr.length/2;
		return arr[index];
	}
}
