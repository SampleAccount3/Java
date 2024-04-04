import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        VarLengthArgList("Melanio", "Flores");
        // Output:
        // Melanio
        // Flores

    }
    // use String if you have multiple Arguments that has the same data type
    // You can only declare it as a last argument
    public static void VarLengthArgList(String... name){
        for (String names: name){
            System.out.println(names);
        }
    }


}
