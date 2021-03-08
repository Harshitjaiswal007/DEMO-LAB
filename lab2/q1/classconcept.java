class classconcept
{
int a;//State
void setA(int a)
{
System.out.println("Value Setted");
this.a=a;
}
int getA()
{
System.out.println("Value Returned");
return this.a;
}
public static void main(String args[])
{
classconcept s=new classconcept();
s.setA(10);
s.getA();
}

}