//class : It is a set of object which shares a common structure and behaviour.

class Car
{
    int noOfTires=4;
    String model="BMW";
    String ownerName;

    void honk()
    {
        System.out.println("car is honking ");
    }
    void showDetails()
    {
        System.out.println("no. of tires "+noOfTires);
        System.out.println("model no. "+model);
        System.out.println("owner of this car is "+ownerName);
    }

}
public class classesDemo 
{
    public static void main(String[] args) 
    {
        Car car1=new Car();
        car1.ownerName="Aman Tiwari";
        // System.out.println(car1.model);
        // System.out.println("the owner of this car is "+car1.ownerName);
        // car1.honk();

        Car car2=new Car();

        // System.out.println(car2.model);
        // System.out.println("the owner of this car is "+car2.ownerName);
        // car2.honk();
        car1.showDetails();

        car2.showDetails();



    }
}