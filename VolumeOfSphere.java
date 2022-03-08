import java.util.Scanner;

class VolumeOfSphere
{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        float r=sc.nextFloat();
        float volume=4.0f/3.0f*3.14f*r*r*r;
        System.out.println("Volume of sphere is :"+volume);
    
    }
}