public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Integer : ");
        Integer[] intArray = {1, 2, 3, 4, 5};
        Tableau<Integer> tableauInt = new Tableau<>(intArray);
        tableauInt.printTableau();
        System.out.println("Size : " + tableauInt.getSize());
        System.out.println("Nombre d'elements: " + tableauInt.getNbElements());
        System.out.println("Index 2 : " + tableauInt.getElement(2));
        tableauInt.pushBack(6);
        tableauInt.pushFront(0);
        tableauInt.printTableau();
        System.out.println("Size : " + tableauInt.getSize());
        System.out.println("Nombre d'elements: " + tableauInt.getNbElements());

        System.out.println("\nString : ");
        String[] stringArray = {"B", "C", "D", "E"};
        Tableau<String> tableauString = new Tableau<>(stringArray);
        tableauString.printTableau();
        System.out.println("Size : " + tableauString.getSize());
        System.out.println("Nombre d'elements: " + tableauString.getNbElements());
        System.out.println("Index 2 : " + tableauString.getElement(2));
        tableauString.pushBack("F");
        tableauString.pushFront("A");
        tableauString.printTableau();
        System.out.println("Size : " + tableauString.getSize());
        System.out.println("Nombre d'elements: " + tableauString.getNbElements());

        try 
        {
            Tableau<Integer> clonedTableauInt = tableauInt.clone();
            clonedTableauInt.setElement(2, 99);
            System.out.println("\nOriginal Integer Tableau:");
            tableauInt.printTableau();
            System.out.println("Cloned Integer Tableau:");
            clonedTableauInt.printTableau();
        } 
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Tableau<String> clonedTableauString = tableauString.clone();
            clonedTableauString.setElement(2, "Z");
            System.out.println("\nOriginal String Tableau:");
            tableauString.printTableau();
            System.out.println("Cloned String Tableau:");
            clonedTableauString.printTableau();
        } 
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
    }
}


