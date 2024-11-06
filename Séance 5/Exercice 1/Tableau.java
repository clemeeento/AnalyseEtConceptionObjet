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
        int i = 0; 
        
        this.capacity = tab.length;
        this.nbElements = tab.length;
        this.tableau = (T[]) new Object[capacity];

        for(T element : tab)
        {
            this.tableau[i] = element;
            i = i + 1;
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
        for(T element : this.tableau)
        {
            System.out.println(element);
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
        int i = 0;

        this.tableau = (T[]) new Object[size];
        for(T element : array)
        {
            this.tableau[i] = element;
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
        // Cette boucle ne peut pas être transformée en for-each car elle déplace les éléments.
        for (int i = this.nbElements; i > 0; i = i - 1) 
        {
            this.tableau[i] = this.tableau[i - 1];
        }
        this.tableau[0] = element;
        this.nbElements = this.nbElements + 1;
    }
}