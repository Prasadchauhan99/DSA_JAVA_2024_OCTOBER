import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	
	HashMap<Integer,Integer> macha=new HashMap<>();
	
	int a[]={1,2,31,1,31,1,2,1,4,5};
	
	
	for(int i=0;i<a.length;i++)
	{
	    int n=a[i];
	    if(macha.containsKey(n))
	    {
	        int prev=macha.get(n);
	        macha.put(n,prev+1);
	    }
	        else{
	            macha.put(n,1);
	        }
	    }
	    
	    for(int moon:macha.keySet())
	    {
	        System.out.println(moon+" -->"+macha.get(moon));
	    }
	}

}