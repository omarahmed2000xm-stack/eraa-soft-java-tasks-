import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main ( String[] args){
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
       List<Integer>information= data.stream().flatMap(List->List.stream()).toList();
        System.out.println(information);
    }
}
