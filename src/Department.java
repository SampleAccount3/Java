public class Department extends Human{
    public Department(String name, int age, String specialty, IWorkables workables){
        super(name, age, specialty, workables);
        setWorkables(workables);
    }
}
