public class MyArray
{
    private int capacity = 0;
    private int []myArray;

    public MyArray(int capacity)
    {
        this.capacity = capacity;
    }


    public MyArray(int []array)
    {
        this.capacity = array.length;
        this.myArray = new int[capacity];
        for(int i = 0; i < capacity; i = i + 1)
        {
            this.myArray[i] = array[i];
        }
    }
    public int getSize()
    {
        return this.capacity;
    }

    public int getElement(int index)
    {
        if (index >= 0 && index < this.capacity) 
        {
            return this.myArray[index];
        } 
        else 
        {
            System.out.println("out of bounds");
            return -1;
        }
    }

    public void pushBack(int element) 
    {
        if (this.capacity == this.myArray.length) 
        {
            System.out.println("tableau plein");
            return;
        }
        this.myArray[this.capacity] = element;
        this.capacity = this.capacity + 1;
    }

    public void pushFront(int element) 
    {
        if (this.capacity == this.myArray.length) 
        {
            System.out.println("tableau plein");
            return;
        }
        for (int i = this.capacity; i > 0; i = i - 1) 
        {
            this.myArray[i] = this.myArray[i - 1];
        }
        this.myArray[0] = element;
        this.capacity = this.capacity + 1;
    }

    public void reallocArray(int []array, int size)
    {
        this.capacity = size;
        this.myArray = new int[size];
        for(int i = 0; i < size; i = i + 1)
        {
            this.myArray[i] = array[i];
        }
    }

    public void newPushBack(int element) 
    {
        if (this.capacity == this.myArray.length) 
        {
            int []newArray = new int[this.capacity * 2];
            for (int i = 0; i < this.capacity; i = i + 1) 
            {
                newArray[i] = this.myArray[i];
            }
            this.myArray = newArray;
        }
        this.myArray[this.capacity] = element;
        this.capacity = this.capacity + 1;
    }

    public void newPushFront(int element) 
    {
        if (this.capacity == this.myArray.length) 
        {
            int []newArray = new int[this.capacity * 2];
            for (int i = 0; i < this.capacity; i = i + 1) 
            {
                newArray[i] = this.myArray[i];
            }
            this.myArray = newArray;
        }
        for (int i = this.capacity; i > 0; i = i - 1) 
        {
            this.myArray[i] = this.myArray[i - 1];
        }
        this.myArray[0] = element;
        this.capacity = this.capacity + 1;
    }
}