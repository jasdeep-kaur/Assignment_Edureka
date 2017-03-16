package daythree;

/**
 * Created by jasdeepkaur on 2/25/17.
 */


import java.util.LinkedList;

interface Queue
{
    void insert(java.util.Queue x, int y);
    void delete(java.util.Queue x);
}
 class Queuein implements Queue
{
    public void insert(java.util.Queue x, int y)
    {
        x.add(y);
    }
    public void delete(java.util.Queue x)
    {
        x.remove();
    }
    public static void main(String[] args)
    {
        java.util.Queue q1 = new LinkedList();
        Queuein obj = new Queuein();
        obj.insert(q1,30);
        obj.insert(q1,14);
        obj.insert(q1,19);
        obj.delete(q1);
        System.out.println(q1);
    }
}
