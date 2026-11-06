import java.util.Scanner;
public class elementsinput {
    void input (int [][] array){
        Scanner faye = new Scanner (System.in);
        
        System.out.println("--------------------------");
        System.out.println("Enter elements: ");

        for (int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print("Row [" + (row + 1) + "] Column [" + (column + 1) + "]: ");
                
                array [row][column] = faye.nextInt();
            }
        }
        System.out.println("--------------------------");
        System.out.println("           ARRAY           ");
    }
}
