import java.util.Scanner;

public class greatestCommonFactor {

public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);


    System.out.println("Enter first number:");
    int num1 = keyboard.nextInt();

    System.out.println("Enter second number:");
    int num2 = keyboard.nextInt();
    
    int gcd = 1;

    for(int i = 1; i <= num1 && i <= num2; i++)
    {
        if(num1%i==0 && num2%i==0)
                gcd = i;
    }
    
    System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
}


}

    

