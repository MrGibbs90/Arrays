public class Main {
    public static int[] generateRandomArray () {
        int[] arr = new int[30];
        return arr;
    }
    public static void main(String[] args) {
        generateRandomArray();
        java.util.Random random = new java.util.Random();
        int arr[] = generateRandomArray();
        int amountOfExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            amountOfExpenses += arr[1];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfExpenses);
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min);
        System.out.println("Максиммальная сумма трат за день составила " + max);
        System.out.println("Средняя сумма трат за месяц составила " + amountOfExpenses / (float) arr.length);
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    }