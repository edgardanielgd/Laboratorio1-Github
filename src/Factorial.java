public class Factorial {
    public static int calculateFactorial(int entry){
        if(entry <= 0){
            return 1;
        }
        return entry*calculateFactorial(entry-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}
