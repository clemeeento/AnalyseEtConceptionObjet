public class fibonacci 
{
    public static void main(String[] args) 
    {
        int x0 = 1;
        int x1 = 1;
        int x2 = 0;
        
        while(x2 <= 1000)
        {
            x2 = x1 + x0;
            System.out.println(x2);
            x0 = x1;
            x1 = x2;
        }
    }
}
