import java.util.Date;

public class Cercle
{
    String couleur;
    double rayon;
    double x;
    double y;
    Date dateModification;

    public Cercle(String couleur, Date dateModification, double rayon, double x, double y) 
    {
        this.couleur = couleur;
        this.rayon = rayon;
        this.x = x;
        this.y = y;
        this.dateModification = dateModification;
    }

    Cercle(Cercle from)
    {
        this.couleur = from.couleur;
        this.rayon = from.rayon;
        this.x = from.x;
        this.y = from.y;
        this.dateModification = new Date(from.dateModification.getTime());
    }

    public void afficher()
    {
        System.out.println("Couleur : " + this.couleur);
        System.out.println("Rayon : " + this.rayon);
        System.out.println("X : " + this.x);
        System.out.println("Y : " + this.y);
        System.out.println("Date de modification : " + this.dateModification);
    }


    public String getCouleur() 
    {
        return couleur;
    }

    public void setCouleur(String couleur) 
    {
        this.couleur = couleur;
        this.dateModification = new Date();
    }


    public double getRayon() 
    {
        return rayon;
    }

    public void setRayon(double rayon) 
    {
        this.rayon = rayon;
        this.dateModification = new Date();
    }


    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
        this.dateModification = new Date();
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
        this.dateModification = new Date();
    }


    public Date getDateModification() 
    {
        return this.dateModification;
    }

    public void setDateModification(int dateModification) 
    {
        this.dateModification.setTime(dateModification);
    }
}