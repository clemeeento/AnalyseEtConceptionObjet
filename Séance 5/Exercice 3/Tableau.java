public class Tableau<T> 
{
    private int capacity = 0;
    private int nbElements = 0;
    private T[] tableau;

    public Tableau(int capacity)
    {
        this.capacity = capacity;
        this.tableau = (T[]) new Object[capacity];
    }

    public Tableau(T []tab)
    {     
        this.capacity = tab.length;
        this.nbElements = tab.length;
        this.tableau = (T[]) new Object[capacity];

        for(int i = 0; i < nbElements; i = i + 1)
        {
            this.tableau[i] = tab[i];
        }
    }

    public Object Clone()
    {
        try
        {
            Tableau<T> clone = (Tableau<T>)super.clone();
            for(int i = 0; i < this.nbElements; i = i + 1)
            {
                clone.tableau[i] = this.tableau[i];
            }
            clone.nbElements = this.nbElements;
            return clone;
        }
        catch(Exception e)
        {
            System.out.println("Erreur lors du clonage");
            return null;
        }
    }

    public int getSize()
    {
        return this.capacity;
    }

    public int getNbElements()
    {
        return this.nbElements;
    }

    public void printTableau()
    {
        for(int i = 0; i < this.capacity; i = i + 1)
        {
            System.out.println(this.tableau[i]);
        }
    }

    public T getElement(int index)
    {
        if (index >= 0 && index < this.capacity) 
        {
            return this.tableau[index];
        } 
        else 
        {
            System.out.println("Index hors du tableau");
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public void reallocArray(T []array, int size)
    {
        for(int i = 0; i < this.nbElements; i = i + 1)
        {
            this.tableau[i] = array[i];
        }
        this.capacity = size;
    }

    public void pushBack(T element) 
    {
        if (this.nbElements == capacity) 
        {
            reallocArray(this.tableau, this.capacity * 2);
        }
        this.tableau[this.nbElements] = element;
        this.nbElements = this.nbElements + 1;
    }

    public void pushFront(T element) 
    {
        if (this.nbElements == capacity) 
        {
            reallocArray(this.tableau, this.capacity * 2);
        }
        for (int i = this.nbElements; i > 0; i = i - 1) 
        {
            this.tableau[i] = this.tableau[i - 1];
        }
        this.tableau[0] = element;
        this.nbElements = this.nbElements + 1;
    }

    public void setElement(int index, T element)
    {
        if (index >= 0 && index < this.capacity) 
        {
            this.tableau[index] = element;
        } 
        else 
        {
            System.out.println("Index hors du tableau");
        }
    }
}