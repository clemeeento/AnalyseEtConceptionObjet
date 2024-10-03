public interface Storable<T> 
{
    void pushBack(T element);
    void pushFront(T element);
    T getElement(int index);
    int getNbElements();
    void printAll();
}
