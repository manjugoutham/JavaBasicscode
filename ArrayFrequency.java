package Bridgelabz;

public class ArrayFrequency {
	
	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,3,5,2,1,3};
		int [] frq= new int[arr.length];
		
		int visit = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
					frq[j]=visit;
				}
			}
			if(frq[i]!=visit)
			frq[i]=count;
		}
		System.out.println("element frequency");
		for(int i=0;i<frq.length;i++)
		{
			if(frq[i]!=visit)
				System.out.println(""+arr[i]+ "  "+frq[i]);
				
		}
			
	}


}
