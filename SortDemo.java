import java.io.*;
class SortDemo
{
    public static void main(String[] args) throws IOException
    {
        int count;
        String temp;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of strings:");
        count = Integer.parseInt(br.readLine());
        
        String str[] = new String[count];
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
 		System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = br1.readLine();
        }
     
       
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + " ");
        }
    }
}