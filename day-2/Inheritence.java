/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Inheritence
{
    public static void main(String aa[])
    {   MathsTeacher ob1=new MathsTeacher();
        ob1.Profession("Maths-Teacher");
        ob1.age(22);
        ob1.teach();
        ob1.walk();
        ob1.talk();


        FootBaller ob2=new FootBaller();
        ob2.Profession("FootBaller");
        ob2.age(28);
        ob2.play();
        ob2.walk();
        ob2.talk();



    }
}
class Person
{
Person()
{

    System.out.println("Default");
}
   void Profession(String a)
   {
       System.out.println("My Profession is"+a);

   }
   void age(int b)
   {
       System.out.println("My age is "+b);


   }
    void walk()
    {
        System.out.println("I can walk");
    }
    void talk()
    {

        System.out.println("I can talk");
    }
}
class MathsTeacher extends Person
{
    void teach()
    {

        System.out.println("i can teach Maths");

    }

}
class FootBaller extends Person
{
  void play()
  {

      System.out.println("i can play FootBall");
  }
}
