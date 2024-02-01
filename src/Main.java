
public class Main {

    public static void main(String[] args) {

        Human melanio = new Department("Melanio", 23,"Programming", new Programmer());

        PrintInfo(melanio);
    }

    public static void PrintInfo(Human human){
        System.out.println(
                "Name: " + human.getName() + "\n"+
                "Age: " + human.getAge() + "\n" +
                "Specialty: " + human.getSpecialty() + "\n"+
                "Job: " + human.workables.WorkType() + "\n");
    }


}
