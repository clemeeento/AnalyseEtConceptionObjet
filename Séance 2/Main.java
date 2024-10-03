public class Main
{
    public static void main(String[] args)
    {
        int []array = {1, 2, 3, 4, 5};
        MyArray myArray = new MyArray(array);
        myArray.printArray();
        System.out.println("Size : " + myArray.getSize());
        System.out.println("Nombre d'elements: " + myArray.getNbElements());
        System.out.println("Index 2 : " + myArray.getElement(2));
        myArray.printArray();
        myArray.pushBack(6);
        myArray.pushFront(0);
        myArray.printArray();
        myArray.newPushBack(6);
        myArray.newPushFront(0);
        System.out.println("Size : " + myArray.getSize());
        System.out.println("Nombre d'elements: " + myArray.getNbElements());
        myArray.printArray();
    }
}
