import java.util.function.BinaryOperator;

public class Generics<T> {
    T value1;
    T value2;
    T value3;
    public Generics(T value1){
        this.value1 = value1;
    }
    public Generics(T value1,T value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public Generics(T value1,T value2,T value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void Print(){
        System.out.println(value1);
    }

    public int Compute2(BinaryOperator<T> add){
        return (int) add.apply(value1,value2);
    }
    public float Compute3(BinaryOperator<T> add){
        return (float) add.apply(value1,value2);
    }

}
