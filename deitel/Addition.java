package deitel;

import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number1; // primeiro numero a somar
        int number2; // segundo numero a somar
        int sum; // soma do number1 number2

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
         
        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
        
        input.close();
    }    
}
