import java.io.*;
class Product
{ 
 int pcode;
 String pname;
 Float price;
 
 void read() throws IOException
 {
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the Product code: ");
   pcode=Integer.parseInt(br.readLine());
   System.out.println("Enter the product name: ");
   pname=br.readLine();
   System.out.println("Enter the product price: ");
   price=Float.parseFloat(br.readLine());;
   
 }
 
 void Display() throws IOException
 {
   System.out.println("Product code: " + pcode);
   System.out.println("Name of the Product: " + pname);
   System.out.println("Price of the product: " + price);
  
  }
}
class ProductDemo
{
	public static void main(String args[]) throws IOException
    {
       int n;
       int emp;
 
      Product p[]=new Product[5];
      for(int i=1;i<=3;i++)
      {
        p[i]=new Product();
        p[i].read();
  
      }
 
     int min=1;
     for(int i=1;i<=3;i++)
     {
  
       if(p[min].price>p[i].price)
       {
         min=i; 
       }
     }

      System.out.println("Product with min price ");
      p[min].Display();


    }
}
	


