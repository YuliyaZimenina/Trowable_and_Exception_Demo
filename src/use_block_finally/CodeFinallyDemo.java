package use_block_finally;

public class CodeFinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            CodeFinally.generateException(i);
            System.out.println();
        }
    }
}
