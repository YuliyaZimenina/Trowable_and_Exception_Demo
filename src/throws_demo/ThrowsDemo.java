package throws_demo;
// Use throws
public class ThrowsDemo {
    public static char prompt(String s) throws java.io.IOException{
        System.out.println(s + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter letter: ");
        }catch (java.io.IOException exception){
            System.out.println("An I/O exception occurred");
            ch = 'X';
        }
        System.out.println("You entered: " + ch);
    }
}
