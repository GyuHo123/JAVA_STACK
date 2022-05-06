package kyuho;

public class DeepCopy {
    public static String[] deepCopy(String[] original, int n) {
        if (original == null) {
            return null;
        }

        String[] result = new String[n];
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, result[i], 0, original[i].length());
        }
        return result;
    }
}
