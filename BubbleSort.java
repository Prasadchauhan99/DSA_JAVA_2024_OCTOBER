public class Main
{
	public static void main(String[] args) {
		
		int a[]={2,4,22,44,5,6,7,1};
		System.out.println("BEFORE BUBLE SORT");
	
		for(int arr:a)
		{
		System.out.print(arr+" ,");
		}
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            int temp=a[j];
		            a[j]=a[j+1];
		            a[j+1]=temp;
		        }
		    }
		}
		System.out.println(" ");
			System.out.println("AFTER BUBLE SORT");
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" , ");
		}
		
		
	}
}