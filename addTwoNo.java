import java.util.Scanner;

public class addTwoNo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;

        System.out.println("Sum is : " + sum);

        
    }
}
