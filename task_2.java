import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {

    public static void Enqueue(Deque<Object> list) {
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner in1 = new Scanner(System.in);
        Object element = in1.nextLine();
        list.addLast(element);
        in1.close();
    }

    public static Object Denque(Deque<Object> list) {
        Object item = list.pollFirst();
        return item;
    }

    public static Object FirstElenemt(LinkedList<Object> list) {
        return list.peekFirst();
    }
}