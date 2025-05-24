import java.util.*;

public class calCGPA {
    public static void main(String[] args) {
        System.out.println("Enter marks for 5 subjects:");
        float sub1, sub2, sub3, sub4, sub5;
        Scanner sc = new Scanner(System.in);
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();
        double cgpa = (sub1 + sub2 + sub3 + sub4 + sub5) / 5 / 9.5;
        System.out.println("Your CGPA is: " + cgpa);
    }
}

