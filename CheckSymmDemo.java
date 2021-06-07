import java.io.*;
class CheckSymmetric
{
	void Display(int m[][],int p,int q) throws IOException
	{
		int i,j;
		System.out.println("The matrix is:");
		for (i = 0; i < p; i++) 
		{
			for (j = 0; j < q; j++) 
			{
				    System.out.print(m[i][j] + "\t");
            }
			     System.out.println("");
        }
	}
  void checkSymmetric(int m[][],int p,int q) throws IOException
  {
        int i,j,f=1;
	    int tp[][]  = new int[p][q];
	    for (i = 0; i < p; i++) 
		{
			for (j = 0; j < q; j++) 
			{
				tp[j][i] = m[i][j];
            }
        }
	
		for (i = 0; i < p; i++) 
		{
			for (j = 0; j < q; j++) 
			{
				if (m[i][j] != tp[i][j])
					{
                        f = 0;
                        break;
                    }
            }
		    if (f == 0) 
			{
				System.out.println("The matrix is not symmetric");
				break;
            }
        }
		if (f == 1) 
		{
			System.out.println("The matrix is  symmetric");
                   
        }
   

  }
}

class CheckSymmDemo
{
    public static void main(String args[]) throws IOException
	  {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int i, j, p, q;
		  System.out.println("Enter the number of rows:");
		  p = Integer.parseInt(br.readLine());
		  System.out.println("Enter the number of columns:");
		  q = Integer.parseInt(br.readLine());
		 
		  int m[][]  = new int[p][q];
		 
		 if(p==q)
		  {
		     System.out.println("Enter the  elements in matrix:");
		     for (i = 0; i < p; i++) 
		     {
			    for (j = 0; j < q; j++) 
			    {
				 m[i][j] = Integer.parseInt(br.readLine());
                }
              }
		  
		     CheckSymmetric c=new CheckSymmetric();
		     c.Display(m,p,q);
		     c.checkSymmetric(m,p,q);
		  }
		  else
		  {
			  System.out.println("Make sure the matrix is Square Matrix!!");
		  }
			  
		  
	  }
}
		  
		