import java.util.Scanner;
public class ASG4_Marks {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student:");
        String name = sc.nextLine();
        System.out.println("Enter Roll no.:");
        int roll = sc.nextInt();
        System.out.println("Enter Marks:");
        float marks = sc.nextFloat();

        System.out.println("Name of student: " + name);
        System.out.println("Roll no.: " + roll);
        System.out.println("Marks of student:" + marks);
    } 
}
