import java.util.Stack;

class stackList {
    public static void main(String[] args) {
        Stack<Integer> numbers= new Stack<>();

        for(int i = 1; i <= 1000; ++i){
            numbers.push(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(numbers.search(124));
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("total run time : "+runTime);
    }
}