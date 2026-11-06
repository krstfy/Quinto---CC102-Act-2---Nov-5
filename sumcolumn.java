public class sumcolumn {
    int [] rowColumn (int [][] array){
        int [] sum = new int[array[0].length];
        int totalcol = 0;

        for (int column = 0; column < array[0].length; column++){
            for (int row = 0; row < array. length; row++){
                sum[column] += array [row][column];
            }
            
            totalcol += sum[column];
        }
        return sum;
    }
}
