import java.util.Random;

/*
 * Created by Hoi Lam Wong and Leon You
 */
public class Team4SortCompetition extends HelperMethods{
	public static void main(String[]args)
	{
		int[] test1 = new int[10000];
		String[] test2 = new String[10000];
		for (int i = 0; i < test1.length; i++)
		{
			test1[i] = (int) Math.floor(Math.random()*10001);
		}
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
		long startTime = System.nanoTime();
		System.out.println(challengeTwo(test2,"oihdw"));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
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
	public static int challengeThree(int[]arr)
	{
		return 0;
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
