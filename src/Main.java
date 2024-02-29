import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

//        When to Use:
//        Generics: <T>
//        Use generics when you want to create classes, interfaces, or methods that
//        can operate on any data type while maintaining strong type safety.
//        Wildcards: <?>
//        Use wildcards when you want to write more flexible and general-purpose code
//        that can work with a range of types without specifying the exact type.

        // Generic Class
        Generics<String> genString = new Generics<>("Melares");
        genString.Print();

        Generics<Integer> genInt = new Generics<>(2, 1);

        System.out.println(
                genInt.Compute2(Integer::sum)
        );
        System.out.println(
                genInt.Compute2((a,b) -> a-b)
        );
        System.out.println(
                genInt.Compute2((a,b) -> a/b)
        );
        System.out.println( genInt.Compute2(Integer::sum));

        Generics<Float> genFloat = new Generics<>(2.1f, 1.1f);
        System.out.println(
                genFloat.Compute3(Float::sum)
        );
        System.out.println(
                genFloat.Compute3((a,b) -> a-b)
        );
        System.out.println(
                genFloat.Compute3((a,b) -> a/b)
        );

        GenericMethod("Melares");
        GenericMethod(2);
        GenericMethod(3.2);
        GenericMethod('+');

        System.out.println(Compute(2,1, (a,b) -> a+b));
    }
    //Generic Methods the print parameter can take any datatype
    public static <T> void GenericMethod(T print){
        System.out.println(print);
    }

    // you can have multiple generics <T,T2>
    public static <T> T Compute(T Num1,T Num2,BinaryOperator<T> operator){
        return operator.apply(Num1,Num2);
    }

}
