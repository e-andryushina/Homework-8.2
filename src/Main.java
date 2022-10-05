public class Main {


    public static void main(String[] args) {

        //Урок Массивы. Ч.2.  Задание 1.
        System.out.println("Урок Массивы. Ч.2.  Задание 1.");
        int[] dayTotal = generateRandomArray();
        int monthTotal = 0;
        for (int daySum : dayTotal) {
            monthTotal += daySum;
        }
        System.out.println("Сумма трат за месяц составила " + monthTotal + " рублей");


        //Урок Массивы. Ч.2.  Задание 2.
        System.out.println("Урок Массивы. Ч.2.  Задание 2.");
        int maxDayTotal = 99999;
        int minDayTotal = 200001;
        for (int daySum : dayTotal) {
            if (daySum > maxDayTotal) {
                maxDayTotal = daySum;
            } else if (daySum < minDayTotal) {
                minDayTotal = daySum;
            }

        }

        System.out.println("Минимальная сумма трат за день составила " + minDayTotal + " рублей. Максимальная сумма трат за день составила " + maxDayTotal + " рублей");


        //Урок Массивы. Ч.2.  Задание 3.
        System.out.println("Урок Массивы. Ч.2.  Задание 3.");

        double dayAverage = (double) monthTotal/dayTotal.length;

        System.out.println("Средняя сумма затрат за месяц составила " + dayAverage + " рублей");

        //Урок Массивы. Ч.2.  Задание 4.
        System.out.println("Урок Массивы. Ч.2.  Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
        System.out.println ();


    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}



