import java.util.*;

class Main
{
	static int removeDuplicates(int arr[], int a)
	{
		if (a==0 || a==1)
			return a;
	
		int[] temp = new int[a];
		
		int q = 0;
		for (int p=0; p<a-1; p++)
			if (arr[p] != arr[p+1])
				temp[q++] = arr[p];
		
		temp[q++] = arr[a-1];
		
		for (int p=0; p<q; p++)
			arr[p] = temp[p];
	
		return q;
	}
	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is ="+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array is = "+Arrays.toString(arr));
		int a = arr.length;
		
		a = removeDuplicates(arr, a);
		System.out.print("Unique Array Length= "+a);
	}
}
 
