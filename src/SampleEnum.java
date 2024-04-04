public enum SampleEnum {

    /**
     * Enums, short for enumerations, are used in programming when we want to represent a group of named constants in our code.
     * Here are some scenarios when you might want to use an enum:
     * <ul>
     * <li>Representing a fixed set of constants: Enums are ideal when you have a variable that can only take one out of a small set of possible values.
     * For example, the days of the week, directions (North, South, East, West), and the suits in a deck of cards (Hearts, Diamonds, Clubs, Spades) are all good candidates for enums.</li>
     * <li>Increasing code readability: Enums can make your code more readable and self-documenting.
     * Instead of using integers or strings to represent different types or states, you can use enums, which makes your code easier to read and understand.</li>
     * <li>Type safety: Enums provide compile-time type safety. If a method accepts an enum type, you can’t pass in any other type, reducing the possibility of errors.</li>
     * <li>Using in switch statements: Enums can be used in switch statements, making your code cleaner and more manageable.</li>
     * <li>Adding behavior to values: In languages like Java, enums can have methods, allowing you to associate behavior with values.</li>
     * </ul>
     * Remember, the use of enums can vary based on the programming language. The above points are general guidelines and may not apply to all languages.
     * Always refer to the specific language documentation for the best practices related to enums. 😊
     */


    /**
     * assigning a value in an enum const
     */

    ROUND(.50F),
    SQUARE (.40F);

    /**
     * enum Fields
     */
    private final float size;

    /**
    * enum Constructor
    * */
    SampleEnum(float size){
        this.size = size;
    }

    /**
     * enum Accessor/Getter
     */
    public float size(){
        return size;
    }
}
