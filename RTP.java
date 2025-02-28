class over
{
  void display()
  {
    System.out.println("This is a superclass");
  }
}
class  ride extends over
{
  void display()
  {
    System.out.println("This is a subclass");
  }
}
class RTP
{
 public static void main(String args[])
 {
	ride r = new ride();
	r.display();
 }
}