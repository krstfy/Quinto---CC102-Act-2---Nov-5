import java.util.Scanner;
public class dataentry {
    Scanner faye = new Scanner(System.in);
    int getRow, getColumn;

    int [][] getArray(){
        System.out.print("Enter number of row > ");
        getRow = faye.nextInt();

        System.out.print("Enter number of column > ");
        getColumn = faye.nextInt();

        return new int [getRow] [getColumn];
    }
}
