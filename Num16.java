package SuppPractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Num16 {
    public  static List<Double> getRecordRow(String rowString){
        String[] values = rowString.split(" ");
        ArrayList<Double> row = new ArrayList<>();
        for(String val:values){
            row.add(Double.parseDouble(val));
        }
        return  row;
    }

    public static double computeMean(List<Double> column){
        double accumulator = 0;
        for(Double val: column){
            accumulator+=val;
        }
        return  accumulator/column.size();
    }
    public static void main(String[] args) throws FileNotFoundException {
        List<Double> col1 = new ArrayList<>();
        List<Double> col2 = new ArrayList<>();
        // pathname  should be absolute
        boolean skipHeader = true;
        try (Scanner scanner = new Scanner(new File("src/data.txt"));) {
            while (scanner.hasNextLine()) {
                if(skipHeader){
                    skipHeader = false;
                    scanner.nextLine();
                    continue;
                }
                List<Double> row = getRecordRow(scanner.nextLine());
                col1.add(row.get(0));
                col2.add(row.get(1));
            }
        }
        System.out.println("Mean of Column 1 "+ computeMean(col1));
        System.out.println("Mean of Column 2 "+ computeMean(col2));
    }
}