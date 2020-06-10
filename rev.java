package hackerrankprograms;
public class reverse 
{
	public static void countPalindromes() 
    {
    // Write your code here
		String s = "aaa"
		ArrayList<String> aaa = new ArrayList<String>();
		String str = "";
		String rev = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++)
		{
			for(int j = i ; j < s.length() ; j++)
			{
				str = s.substring(i, j);
            	sb.append(str);
            	sb = sb.reverse();
            	rev = sb.toString();
            	if((str == rev) == false)
            	{
            		aaa.add(str);
            	}
			}	
		}
		System.out.println(aaa);
    }
}