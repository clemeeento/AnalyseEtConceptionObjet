import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Cercle c1 = new Cercle("rouge", new Date(), 5.0, 0.0, 0.0); 
        Cercle c2 = new Cercle(c1); 
        c2.setRayon(10.0); 
        c2.setDateModification(12345);
        c1.afficher(); 
        c2.afficher(); 
    }
}