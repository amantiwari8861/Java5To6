import java.util.Scanner;

public class switch2{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the color ");

        String col= sc.next();

        switch (col) {
            case "red":
                System.out.println("you choosed red");
                break;
            case "blue":
                    System.out.println("you choosed blue");
                    break;
        
            default: System.out.println("default is white");
                break;
        }

    }
}