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
        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println();

        // Задача 1.2
        System.out.println("Задача 1.2");
        float [] numbers1 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
        System.out.println();

        // Задача 1.3
        System.out.println("Задача 1.3");
        char [] symbols = {'d', 'ц', 'ц'};
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
            if (i<symbols.length-1) {
                System.out.print(", ");}
            else System.out.println(); }
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        String [] f = {"numbers", "numbers1", "symbols"};


    }
}