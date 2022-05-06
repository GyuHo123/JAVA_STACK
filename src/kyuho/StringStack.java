package kyuho;

import java.util.Arrays;

public class StringStack implements Stack {

    private static final int capacity = 10;
    public int size;
    public String[] s1 = new String[capacity];
    protected String[] array = new String[capacity];

    public StringStack() {
    }

    public int length() {
        return capacity;
    }

    public Object pop() {

        String s1[] = array.clone();

        array[size - 1] = null;

        size--;

        return s1[size];


    }

    public boolean push(Object s) {
        array[size] = (String) s;
        size++;
        return (size <= capacity);
    }
}


