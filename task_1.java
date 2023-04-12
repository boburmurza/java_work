import java.util.Collections;
import java.util.LinkedList;

/**
 * Task1
 */
public class task1 {

    static LinkedList<Object> CreatList()
    {
        LinkedList<Object> states = new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.add(1, "Italy");
        states.addFirst("Spain");
        states.add(1, "Russia");
        states.addLast("Great Britain");
        return states;
    }

    static void PrintList(LinkedList<Object> country)
    {
        for (Object string : country)
            System.out.println(string);
    }

    public static LinkedList<Object> ReverseList(LinkedList<Object> country)
    {
        Collections.reverse(country);
        return country;
    }
}
