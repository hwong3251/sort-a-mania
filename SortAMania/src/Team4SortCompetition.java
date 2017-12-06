import java.util.Random;

/*
 * Created by Hoi Lam Wong and Leon You
 */
public class Team4SortCompetition extends HelperMethods{
	public static void main(String[]args)
	{
		long startTime, endTime, totalTime;
		//test1
		int[] test1 = new int[10000];
		for (int i = 0; i < test1.length; i++)
		{
			test1[i] = (int) Math.floor(Math.random()*10001);
		}
		//test2
		String[] test2 = new String[10000];
		for (int i = 0; i < test2.length;i++) 
		{
			String s = "";
			for (int j = 0; j < 5; j++)
			{
				Random r = new Random();
				char c = (char)(r.nextInt(26)+'a');
				s = s+c;
			}
			test2[i] = s;
		}
		//test3
		int[]test3 = new int[10000];	
		for (int i = 0; i < test1.length; i++)
		{
			if(i<=((int)test1.length*0.75))
			{
				test1[i] = i;
			}
			else
			{
				test1[i] = (int) Math.floor(Math.random()*10001);
			}

		}
		
		startTime = System.nanoTime();
		System.out.println(challengeOne(test1));
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Time Take in nanoseconds: " + totalTime);
		
		startTime = System.nanoTime();
		System.out.println(challengeTwo(test2,"oihdw"));
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Time Take in nanoseconds: " + totalTime);
		
		
		startTime = System.nanoTime();
		System.out.println(challengeThree(test3));
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Time Take in nanoseconds: " + totalTime);


	}
	public static int challengeOne(int[]arr)
	{
		insertionSort(arr);
		return getMedian(arr);
	}
	public static int challengeTwo(String[]arr, String query)
	{
		arr = mergeSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]==query)
				return i;
		}
		return -1;
	}
	//Mostly Sorted
	public static int challengeThree(int[]arr)
	{
		bubbleSort(arr);
		return getMedian(arr);
	}
	public int challengeFour(int[][] arr)
	{
		return 0;
	}
	public int challengeFive(Object[] arr, Object query)
	{
		return 0;
	}
	
}
