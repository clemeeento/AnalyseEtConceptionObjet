public class Main
{
    public static void main(String[] args) 
    {
        var calc = new Calc();
        System.out.println(calc.f(1.1, 2.2));
        System.out.println(calc.f(1.1, 2.2, 3.3));
        System.out.println(calc.f(1.1, 2.2, 3.3, 4.4));
    }
}