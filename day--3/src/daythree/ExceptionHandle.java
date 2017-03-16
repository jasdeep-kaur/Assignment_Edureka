package daythree;

/**
 * Created by jasdeepkaur on 2/25/17.
 */
public class ExceptionHandle
{

    public static void main(String[] args)
    {
        try
        {
            System.out.println(525/5);
            try
            {
                System.out.println(7/0);
            }
            catch(Exception e)
            {
                System.out.println("inner  block : "+e);
            }
        }
        catch(Exception e)
        {
            System.out.println("outer block : "+e);
        }
        finally
        {
            System.out.println(" finally block");
        }
    }

}
