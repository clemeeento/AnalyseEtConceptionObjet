import java.util.ArrayList;

public class MyList<T> implements Storable<T> 
{
    private ArrayList<T> list = new ArrayList<>();

    public void pushBack(T element) 
    {
        list.add(element);
    }

    public void pushFront(T element) 
    {
        list.add(0, element);
    }

    public T getElement(int index) 
    {
        if (index >= 0 && index < list.size()) 
        {
            return list.get(index);
        } 
        else 
        {
            System.out.println("Index hors de la liste");
            return null;
        }
    }

    public int getNbElements() 
    {
        return list.size();
    }

    public void printAll() 
    {
        System.out.println("Contenu de la liste :");
        for (T element : list) 
        {
            System.out.println(element);
        }
    }
}
