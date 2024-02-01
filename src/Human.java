public class Human {
    public Human(String name, int age, String specialty, IWorkables workables) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
        this.workables = workables;
    }

    private String name;
    private int age;
    private String specialty;
    IWorkables workables;

    public void setWorkables(IWorkables workables) {
        this.workables = workables;
    }

    public Human() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}
