public class Jeu
{
    public static void main(String[] args)
    {
        Joueur Joueur1 = new Joueur(0, 0);

        Personnage []listeEnnemis = new Personnage[3];

        listeEnnemis[0] = new Gobelin(1, 0);
        listeEnnemis[1] = new Orc(1, 3);
        listeEnnemis[2] = new Elf(2, 2);

        // Faire bouger le joueur
        for(int i = 0; i < 5; i = i + 1)
        {
            for(int j = 0; j < 5; j = j + 1)
            {
                Joueur1 = new Joueur(i, j);
                System.err.println("Joueur en (" + i + ", " + j + ")");
                Joueur1.aUnEnnemiProche(listeEnnemis);
            }
        }
       
    }
}