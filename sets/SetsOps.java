package sets;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class SetsOps {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 100; i ++) l.add(i);
        Iterator iter  = l.descendingIterator();
        while (iter.hasNext()) System.out.println(iter.next());

    }
}
