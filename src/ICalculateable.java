public interface ICalculateable {
    int Computation(int x, int y);
}

class Dull implements  ICalculateable {
    public int Computation(int x, int y) {
        return 0;
    }
}
class Addition implements  ICalculateable {
    public int Computation(int x, int y) {
        return x + y;
    }
}
class Subtraction implements  ICalculateable {
    public int Computation(int x, int y) {
        return x - y;
    }
}
class Multiplication implements  ICalculateable {
    public int Computation(int x, int y) {
        return x * y;
    }
}
class Division implements  ICalculateable {
    public int Computation(int x, int y) {
        return x / y;
    }
}