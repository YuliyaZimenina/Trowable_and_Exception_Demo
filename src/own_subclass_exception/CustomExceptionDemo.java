package own_subclass_exception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        // The numbers array contains multiple odd values.
        int[] numbers = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] div = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i]%2 !=0)
                    throw new NonInResultException(numbers[i], div[i]);
                System.out.println(numbers[i] + " / " + div[i] + " = " +
                        numbers[i]/div[i]);
            }catch (ArithmeticException exception){
                // Catch exception
                System.out.println("Division by zero is impossible!");
            }catch (ArrayIndexOutOfBoundsException exception){
                // Catch exception
                System.out.println("The corresponding element was not found.");
            }catch (NonInResultException exception){
                System.out.println(exception);
            }
        }
    }
}
