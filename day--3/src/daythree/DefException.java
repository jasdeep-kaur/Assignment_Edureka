package daythree;

/**
 * Created by jasdeepkaur on 2/25/17.
 */
class MyException extends Exception
{
    //String s1;
    MyException(String s2)
    {
        System.out.println(s2);
        //s1=s2;
    }
   /*
   public String toString()
   {
       return (s1) ;
   }*/
}

class DefException
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("User Defined Exception");
        }
        catch(MyException e)
        {
            System.out.println("Example : "+e) ;
            //System.out.println("****");
        }
    }
}
