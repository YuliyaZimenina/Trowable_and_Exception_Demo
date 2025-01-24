package exception_special_class_demo;
// Using Exception special class
public class IQueueDemo {
    public static void main(String[] args) {
        FixedSizeQueue fixedSizeQueue = new FixedSizeQueue(10);
        char ch;
        int i;

        try{
            // The queue is full - demo
            for (i = 0; i < 11; i++) {
                System.out.print("Attempt to save: " + (char)('A' + i));
                fixedSizeQueue.putCharQ((char) ('A' + i));
                System.out.println(" - Successfully!");
            }
            System.out.println();
        }catch (QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try {
            // The queue is empty - demo
            for (i = 0; i < 11; i++) {
                System.out.print("Getting the next character from the queue: ");
                ch = fixedSizeQueue.extractCharQ();
                System.out.println(ch);
            }
        }catch (QueueEmptyException exception){
            System.out.println(exception);
        }
    }
}
