public class duplicate {
    void findDuplicates(int[][] array) {
    boolean found = false;

        System.out.println("DUPLICATED NUMBERS:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                boolean duplicates = false;

        for (int a = 0; a <= i; a++) {
            for (int b = 0; b < array[a].length; b++) {

                if (a == i && b >= j) {
                    break;
                }
                if (array[i][j] == array[a][b]) {
                    duplicates = true;
                }
            }
        }
                if (duplicates == true) {
                    continue;
                }

                boolean duplicateFound = false;

       for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {

                if (i == x && j == y) {
                    continue;
                }

        if (array[i][j] == array[x][y]) {
            if (duplicateFound == false) {
                    System.out.println("\nNumber: " + array[i][j]);
                    System.out.println("Locations > ");
                    System.out.println("Row " + (i + 1) + ", Column " + (j + 1));
                        duplicateFound = true;
                }
    System.out.println("Row " + (x + 1) + ", Column " + (y + 1));

        found = true;
                }
            }
        }
    }
}
        if (found == false) {
            System.out.println("No duplicates found.");
        }
    }
}
