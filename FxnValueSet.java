import java.util.Scanner;

class Car
{
    String model="BMW";//instance variable
    String ownerName;
    String regNo;

    void setRegNo(String r) //methods
    {
        regNo=r;
    }
    void showDetails()
    {
        System.out.println("owner of this car is "+ownerName);
        System.out.println("model no. "+model);
        System.out.println("Registration no. "+regNo);
    }
}
public class FxnValueSet {
    public static void main(String[] args) {
        
        Car car1=new Car();
        car1.ownerName="Aman Tiwari";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Registration no. :");
        String reg=sc.next();
        car1.setRegNo(reg);

        car1.showDetails();
    }
}