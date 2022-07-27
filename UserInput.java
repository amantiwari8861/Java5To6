import java.util.Scanner;

class UserInput{
    public static void main(String[] args)
    {
       //there are 8 datatypes in java
    //byte, short, int, long, float, double, char, boolean

   /*  byte b = 127; //8 bit -> 1 byte
    short s = 32767;  //16 bit -> 2 bytes
    int i = 2147483647; //32 bit -> 4 bytes
    long l = 9223372036854775807L; //64 bit -> 8 bytes
    float f = 3.14f; //32 bit -> 4 bytes
    double d = 3.145678432567829; //64 bit -> 8 bytes
    char c = 'a'; //16 bit -> 2 bytes 
    boolean bool = true; //1 bit

    System.out.println("byte :"+b);
    System.out.println("short :"+s);
    System.out.println("int :"+i);
    System.out.println("long :"+l);
    System.out.println("float :"+f);
    System.out.println("double :"+d);
    System.out.println("char :"+c);
    System.out.println("boolean :"+bool);

    //String is a class in java
    String str = "Hello my name is aman";
    System.out.println(str); */

    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the Byte");
    byte b=sc.nextByte();
    System.out.println("enter the Short");
    short s=sc.nextShort();
    System.out.println("enter the int");
    int i=sc.nextInt();
    System.out.println("enter the long");
    long l=sc.nextLong();
    System.out.println("enter the float");
    float f=sc.nextFloat();
    System.out.println("enter the double");
    double d=sc.nextDouble();
    System.out.println("zinda hai ?");
    boolean bool=sc.nextBoolean();

    System.out.println("Enter ur first name");
    String name=sc.next();//takes a word as input (same as %s in scanf)
    sc.nextLine();// it is used as fflush(stdin) of c/c++
    System.out.println("Enter ur Full name");
    String fullname=sc.nextLine();//takes a line as input including spaces (same as %[^\n]s in scanf)

    // System.out.println("enter the char");
    // char c=sc.next().charAt(0);

    // System.out.println("\n----------------------------------");
    // System.out.println("Byte :"+b);
    // System.out.println("Short :"+s);
    // System.out.println("int :"+i);
    // System.out.println("long :"+l);
    // System.out.println("float :"+f);
    // System.out.println("double :"+d);
    // System.out.println("is Alive ? :"+bool+" hii "+10);
    // System.out.println("char :"+c);
    System.out.println("name :"+name);
    System.out.println("fullname :"+fullname);


// -2^n to 2^n-1

    }
}