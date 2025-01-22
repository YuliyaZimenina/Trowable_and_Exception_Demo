package use_block_finally;

// Use finally
public class CodeFinally {
    // Method for throwing an exception
    public static void generateException(int what) {
        int d;
        int[] numbers = new int[2];
        System.out.println("Received:" + what);
        try {
            switch (what) {
                case 0:
                    d = 10 / what; // Generate a division by zero error
                    break;
                case 1:
                    numbers[4] = 4; // Generating an index out of bounds error
                    break;
                case 2:
                    return; // Return from the Try block
            }
        } catch (ArithmeticException exception) {
            // Catch the exception
            System.out.println("Division by zero is impossible");
            return; // Return from the Catch Block
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Catch the exception
            System.out.println("The corresponding element was not found.");
        }
        finally { // Executed when exiting try/catch blocks
            System.out.println("Exit from the Try block");
        }
    }
}
