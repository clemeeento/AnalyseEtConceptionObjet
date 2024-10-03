import java.util.Scanner;

public class fibonacciBis
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier strictement positif");

        int n = scanner.nextInt();
        int x0 = 1;
        int x1 = 1;
        int x2 = 0;

        while(n<=0)
        {
            n = scanner.nextInt();
        }
        
        while(x2 < n)
        {
            x2 = x1 + x0;
            System.out.println(x2);
            x0 = x1;
            x1 = x2;
        }
    }
}
