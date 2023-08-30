import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[3][];
        System.out.println("multiplicationTable = " + Arrays.deepToString(multiplicationTable));
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + Arrays.toString(multiplicationTable[i]));
        }
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[3];
            System.out.println("multiplicationTable[" + i + "] = " + Arrays.toString(multiplicationTable[i]));
        }
        System.out.println("\nInitialization array");
        for (int[] ints : multiplicationTable) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }
    }
}
