public class ExceptionError {
    public static void main(String[] agrs) {
       // ErrorExample(10);

       // ExceptionExample(20);

        try {
            //ExceptionExample(10);
            System.exit(1);
            System.out.println("In try block.");
        } catch ( ArithmeticException aExp) {
            System.out.println("Division by zero.");
            aExp.printStackTrace();
        }finally {
            System.out.println("In finally block.");
        }
    }

    public static void ErrorExample(int i){
        while (i != 0) {
            i = i + 1;
            ErrorExample(i);
        }
    }

    public static void ExceptionExample(int k) {
        int y = 0;
        int z = k/y;
    }
}
