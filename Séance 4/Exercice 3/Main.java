public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Test avec Tableau<Integer> :");
        Integer[] intArray = {1, 2, 3, 4, 5};
        Tableau<Integer> tableauInt = new Tableau<>(intArray);
        test(tableauInt);

        System.out.println("\nTest avec MyList<Integer> :");
        MyList<Integer> myListInt = new MyList<>();
        myListInt.pushBack(1);
        myListInt.pushBack(2);
        myListInt.pushBack(3);
        test(myListInt);
    }

    public static void test(Storable<Integer> collection) 
    {
        collection.printAll();
        System.out.println("Nombre d'éléments: " + collection.getNbElements());
        collection.pushBack(10);
        collection.pushFront(0);
        collection.printAll();
    }
}
