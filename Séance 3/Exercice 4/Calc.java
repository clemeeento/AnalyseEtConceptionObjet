public class Calc
{   
    // Méthode pour effectuer une fonction
    private double fonction(double... nombres)
    {
        double resultat = 0;

        // Addition
        // for (double nombre : nombres) 
        // {
        //     resultat = resultat + nombre; // Additioner tous les nombres
        // }

        // Fonction de l'exercice
        for (double nombre : nombres)
        {
            resultat = resultat + (Math.sqrt(nombre) +  nombre * Math.log(nombre)) * (Math.sqrt(nombre) +  nombre * Math.log(nombre));
        }

        return resultat;
    }

    // Méthode pour la fonction de deux nombres
    public double f(double a, double b) 
    {
        return fonction(a, b);
    }

    // Méthode pour la fonction de trois nombres
    public double f(double a, double b, double c) 
    {
        return fonction(a, b, c);
    }

    // Méthode pour la fonction de quatre nombres
    public double f(double a, double b, double c, double d) 
    {
        return fonction(a, b, c, d);
    }
}