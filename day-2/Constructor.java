/**
 * Created by jasdeepkaur on 2/15/17.
 */
public class Constructor
{
    Constructor()
    {
        System.out.println("inside the constructor");

    }
    void display()
    {
        System.out.println("inside the function");
    }

    public static void main(String[] args)
    {

        Constructor obj=new Constructor();
        obj.display();
    }
}
