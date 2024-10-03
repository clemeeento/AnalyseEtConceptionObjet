public class Cercle extends Forme 
{
    // Rayon du cercle
    private double rayon;

    // Constructeur pour un Cercle (appelle le constructeur de Forme pour la position)
    public Cercle(double x, double y, double rayon) 
    {
        super(x, y);
        this.rayon = rayon;
    }

    // Redéfinition de la méthode aire pour calculer l'aire du cercle
    @Override
    public double aire() 
    {
        return Math.PI * rayon * rayon;
    }
}