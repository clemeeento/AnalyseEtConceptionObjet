public class Orc extends Personnage
{
    public Orc(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.Ennemi = true;
    }

    @Override
    public boolean estProche(Personnage P)
    {
        if(!(P.estEnnemi()))
        {
            if(Math.sqrt(Math.pow(this.x - P.getX(), 2) + Math.pow(this.y - P.getY(), 2)) < 4)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}