public class sumrow {
    int [] rowSum (int [][] array){
        int [] sum = new int[array.length];

        for (int row = 0; row <array.length; row++){
            for (int column = 0; column < array [row]. length; column++){
                sum[row] += array [row][column];
            }
        }
        return sum;
    }
}
