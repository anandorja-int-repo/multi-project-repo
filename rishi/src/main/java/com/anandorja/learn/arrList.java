import java.util.List;
import java.util.ArrayList;

class arrList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= 1000; ++i){
            numbers.add(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(numbers.contains(141));
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("total run time : "+runTime);
    }
}