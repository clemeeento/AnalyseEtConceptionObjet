public class type 
{
    public static void fonction(int x) 
    {
        System.out.println("int");
    }
    public static void fonction(long x) 
    {
        System.out.println("long");
    }
    public static void fonction(short x) 
    {
        System.out.println("short");
    }
    public static void fonction(byte x) 
    {
        System.out.println("byte");
    }
    public static void fonction(float x) 
    {
        System.out.println("float");
    }
    public static void fonction(double x) 
    {
        System.out.println("double");
    }
    public static void fonction(char x) 
    {
        System.out.println("char");
    }
    public static void fonction(boolean x) 
    {
        System.out.println("boolean");
    }

    public static void main(String[] args) 
    {
        fonction(2);
        fonction(123456);
        fonction(123456L);
        fonction(123.456);
        fonction(123.456F);
    }
}
