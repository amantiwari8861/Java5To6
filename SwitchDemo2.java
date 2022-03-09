import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day number :");
        String day=sc.next();
        switch(day)
        {
            case "monday":
                System.out.println("the day is monday");
                break;
            case "tuesday":
                System.out.println("the day is tuesday");
                break;
            case "wednesday":
                System.out.println("the day is wednesday");
                break;
            case "thursday":
                System.out.println("the day is thursday");
                break;
            case "friday":
                System.out.println("the day is friday");
                break;
            case "saturday":
                System.out.println("the day is saturday");
                break;
            case "sunday":
                System.out.println("the day is sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
        sc.close();
    }
}