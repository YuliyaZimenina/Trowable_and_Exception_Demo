package exception_special_class_demo;
// Interface for implementing a character queue
public interface ICharQueue {
    // Method for putting a character into a queue
    void putCharQ(char ch)throws QueueFullException;

    // Method to extract a character from a queue
    char extractCharQ() throws QueueEmptyException;
}



