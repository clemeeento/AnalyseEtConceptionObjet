public class Forme
{
    // x et y sont les coordonnées du centre de la forme
    private double x; 
    private double y;

    // Constructeur
    public Forme(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Méthode pour calculer l'aire (par défaut, retourne 0)
    public double aire()
    {
        return 0;
    }

    // Méthode pour calculer la distance du centre à l'origine (0,0)
    public double distanceOrigine()
    {
        return Math.sqrt(x * x + y * y);
    }
}