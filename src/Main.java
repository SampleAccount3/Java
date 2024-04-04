public class Main {

    public static void main(String[] args) {

        /**
         *  Assign the Enum in a variable
         */
        SampleEnum round = SampleEnum.ROUND;
        SampleEnum square = SampleEnum.SQUARE;
        /**
         * .size() retrieves the size of the indicated enum
         */
        System.out.println(round.size());
        System.out.println(square.size());

        System.out.println(square.size() * 4_002.23123f);
    }
}
