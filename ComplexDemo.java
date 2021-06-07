import java.io.*;
class Complex
{
  int real,imaginary;
  void read()  throws IOException
  {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter real part:");
	  real = Integer.parseInt(br.readLine());
	  System.out.println("Enter imaginary part:");
	  imaginary = Integer.parseInt(br.readLine());
  }
  void display()  throws IOException
  {
	  System.out.println(real+"+"+imaginary+"i");
  }
  Complex addComp(Complex c1,Complex c2)
  {
	  Complex temp = new Complex();
	  temp.real = c1.real + c2.real;
	  temp.imaginary = c1.imaginary + c2.imaginary;
	  return temp;
  }
}

class ComplexDemo
{
	public static void main(String args[]) throws IOException
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		c1.read();
		c2.read();
		c1.display();
		c2.display();
		c3=c3.addComp(c1,c2);
		c3.display();
	}
}
		