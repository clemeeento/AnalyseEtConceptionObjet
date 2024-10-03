public class MyArray
{
    private int capacity = 0;
    private int nbElements = 0;
    private int []myArray;

    public MyArray(int capacity)
    {
        this.capacity = capacity;
    }

    public MyArray(int []array)
    {
        this.capacity = array.length;
        this.nbElements = array.length;
        this.myArray = new int[capacity];
        for(int i = 0; i < nbElements; i = i + 1)
        {
            this.myArray[i] = array[i];
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

    public void printArray()
    {
        for(int i = 0; i < this.capacity; i = i + 1)
        {
            System.out.println(this.myArray[i]);
        }
    }

    public int getElement(int index)
    {
        if (index >= 0 && index < this.capacity) 
        {
            return this.myArray[index];
        } 
        else 
        {
            System.out.println("Index hors du tableau");
            return -1;
        }
    }

    public void pushBack(int element) 
    {
        if (this.nbElements == capacity) 
        {
            System.out.println("Tableau plein");
        }
        else
        {
            this.myArray[this.nbElements] = element;
            this.nbElements = this.nbElements + 1;
        }
    }

    public void pushFront(int element) 
    {
        if (this.nbElements == capacity) 
        {
            System.out.println("Tableau plein");
        }
        else
        {
            for (int i = this.nbElements; i > 0; i = i - 1) 
            {
                this.myArray[i] = this.myArray[i - 1];
            }
            this.myArray[0] = element;
            this.nbElements = this.nbElements + 1;
        }
    }

    public void reallocArray(int []array, int size)
    {
        this.myArray = new int[size];
        for(int i = 0; i < this.nbElements; i = i + 1)
        {
            this.myArray[i] = array[i];
        }
        this.capacity = size;
    }

    public void newPushBack(int element) 
    {
        if (this.nbElements == capacity) 
        {
            reallocArray(this.myArray, this.capacity * 2);
        }
        this.myArray[this.nbElements] = element;
        this.nbElements = this.nbElements + 1;
    }

    public void newPushFront(int element) 
    {
        if (this.nbElements == capacity) 
        {
            reallocArray(this.myArray, this.capacity * 2);
        }
        for (int i = this.nbElements; i > 0; i = i - 1) 
        {
            this.myArray[i] = this.myArray[i - 1];
        }
        this.myArray[0] = element;
        this.nbElements = this.nbElements + 1;
    }
}