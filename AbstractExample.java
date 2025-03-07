abstract class Shape
{
  abstract void area();
}
class Square extends Shape
{
  int side;
  Square()
  {
    side=20;
  }
  void area()
  {
    System.out.println("Area of Square is : "+(side*side));
  }
}
class Rectangle extends Shape
{
  int length,breadth;
  Rectangle()
  {
    length=10;
    breadth=20;
  }
  void area()
  {
    System.out.println("Area of Rectangle is : "+(length*breadth));
  }
}
class AbstractExample
{
  public static void main(String args[])
  {
    Square s=new Square();
    s.area();
    Rectangle r=new Rectangle();
    r.area();
  }
}