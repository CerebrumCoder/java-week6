import java.util.Arrays;
import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan number digits
        System.out.printf("Enter the number of digits:: ");
        int banyakAngka = input.nextInt();

        int[] arrayAngka = new int[banyakAngka];

        // Per array diisi angka
        for (int i = 0; i < arrayAngka.length; i++) {
            arrayAngka[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(findDistinctNumber(arrayAngka)));
        input.close();
    }

    public static int[] findDistinctNumber(int[] values) {
        int[] result = new int[values.length];
        int uniqueCount = 0;

        for (int i = 0; i < values.length; i++) {
            int j;
            for (j = 0; j < uniqueCount; j++) {
                if (values[i] == values[j]) {
                    break;
                }
            }

            if (j == uniqueCount) {
                result[uniqueCount++] = values[i];
            }
        }
        return Arrays.copyOf(result, uniqueCount);
    }
}
