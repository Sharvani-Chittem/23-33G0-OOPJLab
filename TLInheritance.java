class Base
{
  int p;
}
class Mul extends Base
{
 int q;
}
class prod extenda Mul
{
 int r;
 prod()
 {
   p=25;
   q=4;
   r=20;
 }
 void sol()
 {
   System.out.println(" Product of p,q,r is : "+(p*q*r));
 }
}
class  TLInheritance
{
  public static void main(String args[])
  {
    prod obj=new prod();
    obj.sol();
  }
}

 
 