package kyuho;

public class IntStack implements Stack {

    private static final int capacity = 10;
    public int size;
    public int[] s1 = new int[capacity];
    protected int[] array = new int[capacity];

    public IntStack() {
    }

    public int length() {
        return capacity;
    }

    public Object pop() {

        int s1[] = array.clone();

        array[size - 1] = 0;

        size--;

        return s1[size];


    }

    public boolean push(Object s) {
        array[size] = Integer.parseInt(s.toString());
        size++;
        return (size <= capacity);
    }
}
