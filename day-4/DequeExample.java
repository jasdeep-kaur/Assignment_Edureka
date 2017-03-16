package com.edureka.session_four; /**
 * Created by jasdeepkaur on 2/24/17.
 */
import java.util.*;

class DequeExample
{
    public static void main(String[] args)
    {
        Deque deq = new LinkedList<>();


        deq.add("(Left)");
        deq.addFirst("(right)");
        deq.addLast("(Left)");
        deq.push("(right)");
        deq.offer("(Left)");
        deq.offerFirst("(right)");
        deq.offerLast("(Left)");

        System.out.println(deq + "\n");

        System.out.println("loop");
        Iterator iterator = deq.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());


         Iterator reverse = deq.descendingIterator();
        System.out.println("Reverse loop");
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());

        System.out.println("peek" + deq.peek());
        System.out.println("After peek: " + deq);

        System.out.println("Pop " + deq.pop());
        System.out.println("After pop: " + deq);

        System.out.println("Contains element 3: " +
                deq.contains("Element 3 (Tail)"));

        deq.removeFirst();
        deq.removeLast();
        System.out.println("Deque after removing " +
                "first and last: " + deq);

    }
}
