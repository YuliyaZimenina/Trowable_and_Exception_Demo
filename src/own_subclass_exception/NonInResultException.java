package own_subclass_exception;
/*
Using a special exception
 */

// Creating an exception class
public class NonInResultException extends Exception{
    int n;
    int d;

    NonInResultException (int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return "The result of " + n + " / " + d + " is not an integer.";
    }
}
