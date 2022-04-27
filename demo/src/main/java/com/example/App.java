package com.example;
import java.util.Scanner;
/**
 * exponents with power recursive
 *
 */
public class App 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer for the base: ");
        int base = in.nextInt();
        System.out.println("");
        System.out.print("Enter an integer for the exponent: ");
        int powerRaised = in.nextInt();
        System.out.println("");
        int result = power(base, powerRaised);
    
        System.out.println(base + "^" + powerRaised + "=" + result);
        }
      public static int power(int base, int powerRaised) 
      {
        if (powerRaised != 0) 
        {
    
          // recursive call to power()
          return (base * power(base, powerRaised - 1));
        }
        else 
        {
          return 1;
        }
      }
}
