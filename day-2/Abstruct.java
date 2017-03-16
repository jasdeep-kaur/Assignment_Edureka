/**
 * Created by jasdeepkaur on 2/16/17.
 */
abstract class Father
    {
       abstract void talk();
    }
class Son extends Father
    {
      void talk(){System.out.println("i talks");
    }


    public static void main(String args[])
    {
        Father obj = new Son();
        obj.talk();
    }
}