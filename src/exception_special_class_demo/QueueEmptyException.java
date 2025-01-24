package exception_special_class_demo;
/*
Class for handling exceptions caused by
errors associated with an empty queue.
 */
public class QueueEmptyException extends Exception{
    public String toString(){
        return "\nThe queue is empty.";
    }
}
