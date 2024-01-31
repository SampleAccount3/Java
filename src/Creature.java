public abstract class Creature {
    protected String name;
    protected int age;

    public abstract String getName();
    public abstract void setName(String name);

    public abstract int getAge();
    public abstract void setAge(int age);


    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
