package exception_special_class_demo;
/*
Class for handling exceptions caused by
errors related to queue overflow.
 */
public class QueueFullException extends Exception{
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nThe queue is full. The maximum queue size is " +
                size + " elements.";
    }
}
