import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mao Shaco on 10/6/2015.
 */
public class Main {
    public static void main(String[] args) {

        String path = "array.txt";
        try {

            int[] a = readIntArrayFromFile(path);

            Integer max = a[a.length / 2];

            long before = System.nanoTime();
            System.out.println(findMaxRecursively(a, max));
            long after = System.nanoTime();

            System.out.println(after - before);

            before = System.nanoTime();
            System.out.println(findMaxLinearly(a, max));
            after = System.nanoTime();

            System.out.println(after - before);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int[] readIntArrayFromFile(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];
        int i = 0;
        for (String str : arrayString) {
            array[i] = Integer.parseInt(str);
            i++;
        }
        return array;
    }

    static int recursiveIteration = 0;
    private static int findMaxRecursively(int[] array, Integer max) {
        int buff = array[recursiveIteration] + array[array.length - recursiveIteration - 1];
        if (buff > max)
            max = buff;
        recursiveIteration++;
        if (recursiveIteration != array.length / 2)
            max = findMaxRecursively(array, max);
        return max;
    }

    private static int findMaxLinearly(int[] array, Integer max) {
        for (int i = 0; i < array.length / 2; i++) {
            int buff = array[i] + array[array.length - i - 1];
            if (buff > max)
                max = buff;
        }
        return max;
    }
}
