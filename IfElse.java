import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur age :");
        int age=sc.nextInt();

        if(age>18)
        {
            System.out.println("you are eligible for voting greater than 18");
        }
        else if(age==18)
        {
            System.out.println("you are eligible for voting equal to 18");
        }
        else
        {
            System.out.println("you are not eligible for voting");
        }

    }
}