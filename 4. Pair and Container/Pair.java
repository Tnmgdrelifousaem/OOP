public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(20);
        pair.setSecond("World");
        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());
    }
}
