import java.util.*;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char C = sc.next().charAt(0);  
        int A = (int) C;  
        System.out.println("ASCII value of '" + C + "' is: " + A);
    }
}
