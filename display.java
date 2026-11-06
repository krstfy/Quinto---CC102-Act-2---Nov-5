public class display {
    void show(int[][] array, int[] row, int[] column) {
        System.out.print("                     ");

        for (int i = 0; i < array[0].length; i++) {
            System.out.print("COL " + (i + 1) + "\t");
        }

        System.out.println("ROW SUM");

        for (int i = 0; i < array.length; i++) {
            System.out.print("ROW " + (i + 1) + "\t    | " + "        \t");

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println(row[i]);
        }

        System.out.print("COLUMN SUM  |       \t");

        int total = 0;

        for (int i = 0; i < column.length; i++) {
            System.out.print(column[i] + "\t");
            total += column[i];
        }

        System.out.println(total);
        System.out.println("\nTOTAL > " + total);
        System.out.println("--------------------------");
    }
}
