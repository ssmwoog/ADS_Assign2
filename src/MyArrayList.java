public class MyArrayList <E> {
    private Object[] array;
    private int size = 0;
    private int capacity = 6;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void add(E newItem) {
        if(size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }
    private void increaseBuffer(){
        capacity = (int) (2.0 * capacity);
        Object[] array2 = new Object[capacity];
        for(int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        for(int i = index; i < size-1;i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }
    public int getSize() {
        return size;
    }
}

