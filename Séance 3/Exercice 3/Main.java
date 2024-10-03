public class Main 
{
    public static void main(String[] args) 
    {
        // Cercle avec un centre (1, 2) et un rayon de 5
        Cercle cercle = new Cercle(1, 2, 5);
        System.out.println("Aire du cercle : " + cercle.aire());
        System.out.println("Distance du cercle à l'origine : " + cercle.distanceOrigine());

        // Rectangle avec un centre (3, 4), une largeur de 6 et une hauteur de 8
        Rectangle rectangle = new Rectangle(3, 4, 6, 8);
        System.out.println("Aire du rectangle : " + rectangle.aire());
        System.out.println("Distance du rectangle à l'origine : " + rectangle.distanceOrigine());
    }
}
