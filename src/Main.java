public class Main {
    public static void main(String[] args) {
        int [] weights = {90, 100, 93, 95, 96, 92, 91, 87, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        // Задача 1.1
        System.out.println("Задача 1.1");
        Object[] numbers = new Object[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println();

        // Задача 1.2
        System.out.println("Задача 1.2");
        Object[] numbers1 = {1.57f, 7.654f, 9.9826f};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);}
        System.out.println();

        // Задача 1.3
        System.out.println("Задача 1.3");
        Object[] symbols = {'d', 'ц', 'ц'};
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
            if (i<symbols.length-1) {
                System.out.print(", ");}
            else System.out.println(); }
        System.out.println();

        // Задача 2.1
        System.out.println("Задача 2.1");
        //Вывод 1 массива
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i<numbers.length-1) {
                System.out.print(", ");}
            else System.out.println(); }
        //Вывод 2 массива
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i<numbers1.length-1) {
                System.out.print(", ");}
            else System.out.println(); }
        //Вывод 3 массива
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
            if (i<symbols.length-1) {
                System.out.print(", ");}
            else System.out.println(); }
        System.out.println();

        // Задача 2.2
        System.out.println("Задача 2.2");
        Object [][] f = new Object[3][];
        f[0] = numbers;
        f[1] = numbers1;
        f[2] = symbols;
        for (int i = 0; i < f.length; i++) {
            for (int g = 0; g < f[i].length; g++) {
                System.out.print(f[i][g]);
                if (g<f[i].length-1) {
                    System.out.print(", ");}
                else System.out.println("   ");
            }
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        Object [][] d = new Object[3][];
        d[0] = numbers;
        d[1] = numbers1;
        d[2] = symbols;
        for (int i = 0; i < d.length; i++) {
            for (int g = d[i].length-1; g >= 0; g--) {
                System.out.print(d[i][g]);
                if (g>0) {
                    System.out.print(", ");}
                else System.out.println("   ");
            }
        }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        int [] numbers2 = {1, 2, 3};
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] % 2 != 0) {
                numbers2[i] += 1;
            }
            System.out.println(numbers2[i]);
        }

    }
}