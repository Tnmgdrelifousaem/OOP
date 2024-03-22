import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private int size;
    
    public DataContainer() {
        this.data = (T[]) new Object[10]; // Initial capacity of 10
        this.size = 0;
    }
    
    public void add(T item) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2); // Double the array size if full
        }
        data[size] = item;
        size++;
    }
    
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null; // Handle out of bounds index
        }
        return data[index];
    }
    
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return; // Handle out of bounds index
        }
        
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1]; // Shift elements to the left
        }
        
        size--;
    }
    
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DataContainer<String> stringContainer = new DataContainer<>();
        
        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");
        
        String fruit = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit);
        
        stringContainer.remove(1);
        
        System.out.println("Size of container: " + stringContainer.getSize());
    }
}
