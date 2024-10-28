import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	
	HashMap<Integer,Integer> bb=new HashMap<>();
	
	int a[]={1,2,31,1,31,1,2,1,4,5};
	
	
	for(int i=0;i<a.length;i++)
	{
	    int n=a[i];
	    if(macha.containsKey(n))
	    {
	        int prev=bb.get(n);
	        macha.put(n,prev+1);
	    }
	        else{
	            bb.put(n,1);
	        }
	    }
	    
	    for(int moon:bb.keySet())
	    {
	        System.out.println(moon+" -->"+bb.get(moon));
	    }
	}

}
