package multi_catch;

//Demonstration of the use of the multiple interception tool

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char [] chars = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if(i == 0)
                    result = a / b; // generate ArithmeticException
                else
                    chars[5] = 'X'; // generate ArrayIndexOutBoundsException
                // The following Catch construct catches both exceptions
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Exception caught: " + exception);
            }
        }
        System.out.println("After multiple interceptions");
    }
}
