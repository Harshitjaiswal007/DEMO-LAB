class calculator
{
public static void main(String args[])
{
String s ="";
int a=0,b=0;
if(args.length==3)
{
  for(int i=0;i<args.length;i++)
  {
    a=Integer.parseInt(args[0]);
    s=args[1];
    b=Integer.parseInt(args[2]);
  }
}
else
{
System.out.println("No of cla is not equal to 3");
}

char c = s.charAt(0);

if(c=='+')
  {
     System.out.println("Addition of"+a+"and"+b+"is"+(a+b));
  }
else if(c=='-')
  {
     System.out.println("Substraction of"+a+"and"+b+"is"+(a-b));
  }
else if(c=='*')
  {
     System.out.println("Multiplication of"+a+"and"+b+"is"+(a*b));
  }
else if(c=='/')
  {
     System.out.println("Division of"+a+"and"+b+"is"+(a/b));
  }
else if(c=='%')
  {
     System.out.println("Mod of"+a+"and"+b+"is"+(a%b));
  }
else
 {
     System.out.println("Please enter a correct operration");
 }

}


}

// end of the program