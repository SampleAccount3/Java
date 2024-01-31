
public class Main {

    public static void main(String[] args) {

        int result;
        Computation basicComputation = new BasicComputation();

        //addition
        basicComputation.setCalculateable( new Addition());
        result = basicComputation.calculateable.Computation(20,4);
        System.out.println(result);

        //subtraction
        basicComputation.setCalculateable( new Subtraction());
        result = basicComputation.calculateable.Computation(20,4);
        System.out.println(result);

        //division
        basicComputation.setCalculateable( new Division());
        result = basicComputation.calculateable.Computation(20,4);
        System.out.println(result);
        //multiplication
        basicComputation.setCalculateable( new Multiplication());
        result = basicComputation.calculateable.Computation(20,4);
        System.out.println(result);

        System.out.println(basicComputation.GetCalculation());









    }

}
