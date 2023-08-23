import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int n : array)
            sum += n;
        System.out.println("Die Summe ist " + sum);

        int maxVal = array[0];
        for (int n : array)
            if (n > maxVal)
                maxVal = n;
        System.out.println("Die größte Zahl ist " + maxVal);

        int zahlen [] = new int[10];
        zahlen[0] = 11;
        zahlen[1] = 12;
        zahlen[2] = 13;
        zahlen[3] = 14;
        zahlen[4] = 15;
        zahlen[5] = 16;
        zahlen[6] = 17;
        zahlen[7] = 18;
        zahlen[8] = 19;
        zahlen[9] = 20;

        int[] summen = new int[zahlen.length];
        for (int i = 0; i < zahlen.length; i++) {
            summen[i] = array[i] + zahlen[i];
            System.out.println("Summe[" + i + "] : " + summen[i]);
        }
        System.out.println("Die Summen beider Arrays sind: " + Arrays.toString(summen));

    }
}
