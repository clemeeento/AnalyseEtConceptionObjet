public class Main
{
    public static void main(String[] args)
    {
        int []array = {1, 2, 3, 4, 5};
        MyArray myArray = new MyArray(array);
        System.out.println(myArray.getSize());
        System.out.println(myArray.getElement(2));
        //myArray.pushBack(6);
        //myArray.pushFront(0);
        myArray.newPushBack(6);
        myArray.newPushFront(0);
        System.out.println(myArray.getElement(0));
        System.out.println(myArray.getElement(5));
    }
}
