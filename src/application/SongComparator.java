package application;

public class SongComparator 
{

	
public int compare(String s1, String s2)
{
	if(s1.compareTo(s2) > 0)  
	{
		System.out.println("S1 greater"); 
	}	
	else if(s1.compareTo(s2) < 0)
	{
		System.out.println("s1 greater");
	}
	else
	{
		System.out.println("equal");
	}
	return s1.compareTo(s2);
}
		
	
}
