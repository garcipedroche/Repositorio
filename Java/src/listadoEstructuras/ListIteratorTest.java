package listadoEstructuras;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    static public void populate(List<Integer> list)
    {
        for (int i = 0; i < 10; ++i)
        {
            list.add(i*i);
        }       
    }
    static public void main(String[] args)
    {
        AbstractList<Integer> list = new ArrayList<Integer>();
        populate(list);

        ListIterator<Integer> it;       
        System.out.println("List going forwards:");
        it = list.listIterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("List going backwards:");
        it = list.listIterator(list.size());
        while (it.hasPrevious())
            System.out.println(it.previous());

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        populate(list2);
        System.out.println("List going forwards:");
        it = list2.listIterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("List going backwards:");
        Iterator<Integer> it2 = list2.descendingIterator();
        while (it2.hasNext())
            System.out.println(it2.next());

    }
}