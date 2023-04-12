import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * HomeWork4
 */
public class home_work_4 {

    public static void main(String[] args) throws IOException {
        LinkedList<Object> country = Task1.CreatList();
        System.out.println("Созданный список стран: ");
        Task1.PrintList(country);
        System.out.println("Список стран после переворота: ");
        Task1.PrintList(Task1.ReverseList(country));

        System.out.println("Введиет номер операции: ");
        System.out.println("1 - поместить элемент(страну) в конец очереди ");
        System.out.println("2 - вернуть первый элемент (страну) из очереди и удалить его");
        System.out.println("3 - вернуть первый элемент (страну) из очереди, не удаляя");
        System.out.println("4 - завершение работы");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        switch (key) {
            case 1:
                System.out.println("Помещения элемента (страны) в конец списка ");
                Task2.Enqueue(country);
                Task1.PrintList(country);
                break;
            case 2:
                System.out.print("Первый элемент (страна) будет удалена: ");
                String firstCountry = (String) Task2.FirstElenemt(country);
                System.out.println(firstCountry);
                Task2.Denque(country);
                System.out.println("Список стран после удаления: ");

                Task1.PrintList(country);
                break;
            case 3:
                System.out.print("Первый элемент (страна): ");
                String newFirstCountry = (String) Task2.FirstElenemt(country);
                System.out.println(newFirstCountry);
                break;
            case 4:
                System.out.println("До свиданья!");
                break;
            default:
                System.out.println("Вы не выбрали операцию!");
                break;
        }
        in.close();


        Task3.EnterKey();



    }
}