class Base
{
 int a;
}
class Derived extends Base
{
 int b;
  Derived()
  {
    a=10;
    b=20;
  }
  void sum()
  {
    System.out.println("Sum of a and b is: "+(a+b));
  }
}
class SingleInheritance
{
  public static void main(String args[])
  {
    Derived s1=new Derived();
    s1.sum();
  }
}