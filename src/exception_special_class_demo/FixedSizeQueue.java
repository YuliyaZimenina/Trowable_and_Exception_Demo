package exception_special_class_demo;
// Class for representing a fixed size queue
public class FixedSizeQueue implements ICharQueue{
    private char [] fixSizeQ; // The array in which the queue is stored
    private int putIndex, getIndex; // Indexes for placing and extracting characters

    // Constructor of an empty queue of a given size
    public FixedSizeQueue(int size){
        fixSizeQ = new char[size];
        putIndex = getIndex = 0;
    }

    // Method for putting a character into a queue
    public void putCharQ(char ch) throws QueueFullException{
        if (putIndex == fixSizeQ.length)
            throw new QueueFullException(fixSizeQ.length);
        fixSizeQ[putIndex++] = ch;
    }

    // Method to extract a character from a queue
    public char extractCharQ() throws QueueEmptyException{
        if (getIndex == putIndex)
            throw new QueueEmptyException();
        return fixSizeQ[getIndex++];
    }
}

