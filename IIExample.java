interface A
{
  void eat();
  void fly();
}
class parrot implements A
{
  public void eat()
  {
    System.out.println("parrot eats");
  }
  public void fly()
  {
    System.out.println("parrot fly  quickly");
  }
}
class peacock implements A
{
  public void eat()
  {
    System.out.println("peacock eats");
  }
  public void fly()
  {
    System.out.println("peacock fly rarely");
  }
}
class IIExample
{
  public static void main(String args[])
  {
	A m1 = new parrot();
	m1.eat();
	m1.fly();
	A m2 = new peacock();
	m2.eat();
	m2.fly();
        System.out.println("Multiple Inheritance is achieved");
  }
}