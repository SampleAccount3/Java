public class Main {

    public static void main(String[] args) {

//        Assign the Enum in a variable.
        SampleEnum round = SampleEnum.ROUND;
        SampleEnum square = SampleEnum.SQUARE;
//        .size() retrieves the size of the indicated enum.
        System.out.println(round.size());
        System.out.println(square.size());

        System.out.println(square.size() * 4_002.23123f);
    }

    /**
     * This is a generic method that swaps the positions of two elements in an array.
     *
     * @param <T> the type of the elements in the array
     * @param array the array
     * @param i the index of the first element
     * @param j the index of the second element
     */
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
