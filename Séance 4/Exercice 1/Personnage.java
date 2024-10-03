public abstract class Personnage
{   
    // Coordonnées du personnage
    public double x;
    public double y;
    // Attribut pour savoir si le personnage est un ennemi ou non
    public boolean  Ennemi;


    public boolean estEnnemi()
    {
        return this.Ennemi;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public abstract boolean estProche(Personnage P);
}