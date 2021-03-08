class largest
{
public static void main(String args[])
{

int a=0,b=0,c=0;
if(args.length==3)
{
  for(int i=0;i<args.length;i++)
  {
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);
  }
}
else
{
System.out.println("No of cla is not equal to 3");
}

if(a>b)
{
  if(a>c)
  {
    System.out.println("the largest number is"+a);
  }
  else
  {
    System.out.println("the largest number is"+c);
  }
}
else
{
  if(b>c)
    {
      System.out.println("the largest number is"+b);
    }
  else
    {
      System.out.println("the largest number is"+c);
    }
}
}
}