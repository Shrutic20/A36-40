import java.util.*;

class pattern
{
	public void display(String str)
	{
		int i=0,j=0;
		char Arr[] = str.toCharArray();
		int len = Arr.length;
		
		for(i=0;i<len-1;i++)
		{
			for(j=0;j<len;j++)
			{
				if(j<len-i)
				{
					System.out.print(Arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.print("\n");
		}
		
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				if(i>=j)
				{
					System.out.print(Arr[j]+"\t");
					
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.print("\n");
		}
	}
}

class Assignment39D
{
	public static void main(String args[])
	{
		String s;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		s =sobj.next();
		
		pattern p = new pattern();
		p.display(s);
	}
}