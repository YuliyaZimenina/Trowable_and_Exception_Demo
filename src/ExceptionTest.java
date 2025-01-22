// Using the Throwable class methods
class ExceptionTest {
    // Method for throwing an exception
    static void generateException(){
        int [] numbers = new int[4];
        System.out.println("Method for throwing an exception");
        // Generate an index out of bounds exception
        numbers[7] = 10;
        System.out.println("This line will not be printed to the console.");
    }
}
