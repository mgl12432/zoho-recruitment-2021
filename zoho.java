import java.*;
import java.util.Scanner;

public class zoho
{
    public static void main(String[]args)
    {
        int num,current;

        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        current=num;

        for(int i=num; i>=1;i--)
        {
            for(int j=num; j>=1; j--)
            {
                if(i >= j)
                {
                    System.out.print(current);
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
            current--;
        }
    }
    
}