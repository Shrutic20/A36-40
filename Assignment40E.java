import java.util.*;

class pattern
{
	public void display(int row,int column)
	{
		int num=0;
		
		for(int i=1;i<=row;i++)
		{
			num=1;
			for(int j=1;j<=column;j++)
			{
				if(i==1 || i==row) 
            {
                System.out.print(num+"\t");
            }
            else if(j==1 || j==column)
            {
                System.out.print(num+"\t");
            }
            else if(i==j)
            {
                System.out.print(num+"\t");
            }
			else{
				System.out.print(" \t");
			}
			num++;
			
		}
		System.out.print("\n");
		}
	}
}

class Assignment40E
{
	public static void main(String args[])
	{
		int iRow=0, iCol=0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		iRow=sobj.nextInt();
		
		System.out.println("Enter number of columns : ");
		iCol=sobj.nextInt();
		
		pattern p = new pattern();
		p.display(iRow,iCol);
	}
}