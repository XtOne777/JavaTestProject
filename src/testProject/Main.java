package testProject;

import java.util.*;

public class Main  {
    private static final Scanner scanner = new Scanner(System.in);

    private static void sort(){
        System.out.print("Укажите количество массивов для сортировки: ");

        ArrayList<Integer[]> nice = new ArrayList<>();
        int range = scanner.nextInt();
        for (int i = 0; i < range; i++){
            System.out.print("Укажите массив " + (i + 1) + ": ");
            String[] a = scanner.next().split(",");
            Integer[] b = new Integer[a.length];
            for (int d = 0; d < a.length; d++){
                b[d] = Integer.valueOf(a[d]);
            }
            nice.add(b);
        }

        BubbleSort sort = new BubbleSort();
        sort.intCollectionSort(nice);

        for (Integer[] i : nice){
            System.out.println(Arrays.toString(i));
        }
    }

    private static String game(String type){
        if (Objects.equals(type, "speed")){
            System.out.print("Введите количество тестов: ");
            int b = scanner.nextInt();
            long a = System.nanoTime();
            Random random = new Random();
            for (int i = 0; i < b; i++){
                int num_1 = random.nextInt(100);
                int num_2 = random.nextInt(100);
                do {
                    System.out.print(num_1 + " - " + num_2 + ": ");
                } while (scanner.nextInt() != num_1 - num_2);
            }
            double time = System.nanoTime() - a;
            return "Пройдено за " + ((time / 1000000000) + " секунд!");
        }
        if (Objects.equals(type, "result"))
        {
            System.out.print("Введите количество тестов: ");
            int b = scanner.nextInt();
            int mistakes = 0;
            Random random = new Random();
            for (int i = 0; i < b; i++){
                int num_1 = random.nextInt(100);
                int num_2 = random.nextInt(100);
                System.out.print(num_1 + " - " + num_2 + ": ");
                if (scanner.nextInt() != num_1 - num_2){
                    mistakes += 1;
                }
            }
            return "Ошибок " + mistakes + " из " + b;
        }
        return "Такого типа игры нет!";
    }

    private static void start_game(){
        System.out.print("Выберите режим игры(result; speed): ");
        String gameType = scanner.next();
        System.out.println(game(gameType));
    }

    public static void main(String[] args)
    {
        System.out.print("Выберите сортировку или игру(sort; game): ");
        switch (scanner.next()){
            case "sort":
                sort();
                break;
            case "game":
                start_game();
                break;
        }
    }
}
