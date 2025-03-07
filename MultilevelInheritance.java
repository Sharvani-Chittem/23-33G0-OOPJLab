class Base
{
 int p;
}
class Mul extends Base
{
 int q;
}

class  Prod extends Mul
{
 int r;
  Prod()
  {
    p=25;
    q=4;
    r=20;
  }
  void sol()
  {
    System.out.println("Product  of p,q and r is: "+(p*q*r));
  }
}
class MultilevelInheritance
{
  public static void main(String args[])
  {
    Prod obj=new Prod();
    obj.sol();
  }
}