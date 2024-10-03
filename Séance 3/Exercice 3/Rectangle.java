public class Rectangle extends Forme
{   
    // Dimensions du rectangle
    private double largeur;
    private double hauteur;

    // Constructeur
    public Rectangle(double x, double y, double largeur, double hauteur)
    {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    // Redéfinition de la méthode aire pour calculer l'aire du rectangle
    @Override
    public double aire()
    {
        return largeur * hauteur;
    }

}