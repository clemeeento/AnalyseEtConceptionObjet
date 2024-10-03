public class Joueur extends Personnage
{
    public Joueur(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.Ennemi = false;
    }
    
    @Override
    public boolean estProche(Personnage P)
    {
        if(P.estEnnemi())
        {
           return P.estProche(this);
        }
        else
        {
            return false;
        }
    }

    public boolean aUnEnnemiProche(Personnage []ennemis)
    {
        for (Personnage ennemi : ennemis) 
        {
            if(this.estProche(ennemi))
            {
                System.out.println("Le joueur a un ennemi proche ! \n");
                return true;
            }
        }

        System.out.println("Le joueur n'a pas d'ennemi proche ! \n");
        return false;
    }
}