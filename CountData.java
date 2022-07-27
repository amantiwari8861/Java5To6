import java.util.Scanner;

class CountData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char arr[] = new char[10];
        int CapCount = 0, SmallCount = 0, DigitCount = 0, SpecialCount = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th index character: ");
            arr[i] = sc.next().charAt(0);//charAt(0) is used to get the first character of the string
        }
        /* System.out.println("------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Character at " + i + "th index is: " + arr[i]);
        } */
        for (char c : arr) {
            System.out.println("Character is: " + c);
        }
        for (int i = 0; i < arr.length; i++) 
        {
            
            if (arr[i]>=65 && arr[i]<=90) 
            {
                CapCount++;
            }
            else if(arr[i]>=97 && arr[i]<=122)
            {
                SmallCount++;
            }
            else if(arr[i]>=48 && arr[i]<=57)
            {
                DigitCount++;
            }
            else
            {
                SpecialCount++;
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total number of capital letters: " + CapCount);
        System.out.println("Total number of small letters: " + SmallCount);
        System.out.println("Total number of digits: " + DigitCount);
        System.out.println("Total number of special characters: " + SpecialCount);

        sc.close();
    }
}