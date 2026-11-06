public class ActivityNov5CC102 {

    public static void main(String[] args) {
        int [][]array = new dataentry().getArray();
        new elementsinput().input(array);
        int[]row=new sumrow().rowSum(array);
        int[]column=new sumcolumn().rowColumn(array);
        new display().show(array,row,column);
        duplicate dup = new duplicate();
        dup.findDuplicates(array);
    }
}
