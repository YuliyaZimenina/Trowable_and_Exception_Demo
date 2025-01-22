public class UseThrowableMethods {
    public static void main(String[] args) {
       try{
           ExceptionTest.generateException();
       }
       catch (ArrayIndexOutOfBoundsException exception){
           // Catch the exception
           System.out.println("The standard message: ");
           System.out.println(exception);
           System.out.println("\nStack trace: ");
           exception.printStackTrace();
       }
        System.out.println("After the catch()");
    }
}