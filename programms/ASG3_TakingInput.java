import java.util.Scanner;
public class ASG3_TakingInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Taking Input from the user");
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of these numbers is: ");
        System.out.println(sum);

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter your name");
        String myname = sc.nextLine();
        System.out.println(myname);

    }
    
}
