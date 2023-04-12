import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    static LinkedList<Object> list = new LinkedList<>();

    public static void EnterKey() throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println(
                "\nПожалуйста введите номер операции: \n1. Сложение (+) \n2. Вычетание(-) \n3. Деление (/) \n4. Умножение (*) \n5. Отменить последнее действие \n6. Выйти (q)");
        System.out.print("Пожалуйста введите номер операции: ");
        char operation = in.nextLine().charAt(0);
        if (operation == 'q' || operation == 'Q' || operation == '6')
            System.out.println("Всего доброго.");
        else if ( operation == '5')
            DeleteResultOperation(list);
        else {
            System.out.print("Пожалуйста введите 1 число: ");
            double fitrstNumber = in.nextDouble();
            System.out.print("Пожалуйста введите 2 число: ");
            double secondNumber = in.nextDouble();
            Operations(operation, fitrstNumber, secondNumber);
        }
        in.close();
    }

    public static void Operations(char operation, double number1, double number2) throws IOException {
        double result = 0;
        switch (operation) {
            case '+':
            case '1': {
                result = number1 + number2;
                operation = '+';
                break;
            }
            case '-':
            case '2': {
                result = number1 - number2;
                operation = '-';
                break;
            }
            case '/':
            case '3': {
                if (number2 != 0) {
                    result = number1 / number2;
                    operation = '/';
                    break;
                } else {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
            }
            case '*':
            case '4': {
                result = number1 * number2;
                operation = '*';
                break;
            }
            default:
                System.out.print("Данная операция не предусмотренна в калькуляторе");
        }
        System.out.printf("%.2f %s %.2f = %.2f\n", number1, operation, number2, result);
        list.add(result);
        Writer(result);
        System.out.println("Результаты вычислений: ");
        for (Object object : list)
            System.out.println(object);
        System.out.println("Вы хотите продолжить?");
        System.out.println("Если да, нажмите: Y, если нет: N");
        try (Scanner in = new Scanner(System.in)) {
            char exit = in.nextLine().charAt(0);
            if (exit == 'y' || exit == 'Y')
                EnterKey();
            else
                System.out.println("Всего доброго.");
        }
    }

    public static Object DeleteResultOperation(Deque<Object> list) {
        Object item = list.pollLast();
        System.out.println("Результаты вычислений без последней операции: ");
        for (Object object : list)
            System.out.println(object);
        return item;
    }

    static void Writer(Object object) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("C:\\Users\\fil_a\\Desktop\\Учеба\\Java\\HomeWork4\\Log.txt", true),
                "UTF-8"));

        LinkedList<Object> result = new LinkedList<>();
        result.add(object);
        StringBuilder sb = new StringBuilder();
        sb.append(object);
        String str = sb.toString();
        writer.write(str);

        writer.newLine();
        writer.close();
    }
}
