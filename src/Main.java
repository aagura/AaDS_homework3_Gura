import java.util.*;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();

        System.out.print("Введите минимальное значение для случайных чисел: ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное значение для случайных чисел: ");
        int max = scanner.nextInt();


        System.out.println("Исходный список:");
        LL list = RandomLL.fill(size,min,max);
        list.print();

        list.reverse();

        System.out.println("Развёрнутый список:");
        list.print();
    }
}
