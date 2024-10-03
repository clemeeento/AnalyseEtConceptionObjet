public class fizzbuzz
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 15; i = i +1)
        {
            if((i%3 == 0) && (i%5 == 0))
            {
                System.out.println("fizzbuzz");
            }
            else
            {
                if(i%3 == 0)
                {
                    System.out.println("fizz");
                }
                if(i%5 == 0)
                {
                    System.out.println("buzz");
                }
                if((i%3 != 0) && (i%5 != 0))
                {
                    System.out.println(i);
                }
            }
        }
    }
}