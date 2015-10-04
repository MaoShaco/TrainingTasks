/**
 * Created by Mao Shaco on 10/3/2015.
 */
public class Main {
    public static void main(String[] args) {
        int n = 20;
        doCycleFor(n);

        doCycleWhile(n);

        doCycleDoWhile(n);
    }

    private static void showMatrix(int[] a) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static void doCycleFor(int size) {
        int[] a = new int[size];
        for (int i = 0, even = 2; i < size; i++, even += 2) {
            a[i] = even;
            if ((i + 1) % 2 == 0)
                a[i] *= a[i - 1];
        }
        showMatrix(a);
    }

    private static void doCycleWhile(int size) {
        int[] a = new int[size];
        int i = 0;
        int even = 2;
        while (i < size) {
            a[i] = even;
            if ((i + 1) % 2 == 0)
                a[i] *= a[i - 1];

            even += 2;
            i++;
        }
        showMatrix(a);
    }

    private static void doCycleDoWhile(int size) {
        int[] a = new int[size];
        int i = 0;
        int even = 2;
        do {
            a[i] = even;
            if ((i + 1) % 2 == 0)
                a[i] *= a[i - 1];

            even += 2;
            i++;
        } while (i < size);
        showMatrix(a);
    }
}

