/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp2249.assessment2;
import java.util.Scanner;
/*
 * @author Jeff Mazzie
 */
public class Assessment2 
{
    private static final Scanner text = new Scanner( System.in);

    public static void main(String[] args) 
    {
        int intarray[] = new int[3];
        System.out.print("Teacher's copy");
        System.out.print("\nEnter the first integer: ");
        intarray[0] = text.nextInt();
        System.out.print("Enter the second integer: ");
        intarray[1] = text.nextInt();
        System.out.print("Enter the third integer: ");
        intarray[2] = text.nextInt();
        System.out.print("The sum of three integers = " + sum(intarray));
        System.out.print("\nThe product of three integers = " + product(intarray));
    }

    public static int sum(int[] inputArray)
    {
        int sum = 0;
        for(int i=0;i < inputArray.length;i++)
        {
            sum += inputArray[i];
        }
    return sum;
    }

    public static int product(int[] inputArray)
    {
        int prod = 1;
        for(int i=0;i < inputArray.length;i++)
        {
            prod *= inputArray[i];
        }
    return prod;
    }
}
