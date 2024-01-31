public class Animals {
    private String name;
    private int age;
    private boolean isGood;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getisGood() {
        return isGood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public void AnimalName(){
        System.out.println("The name is " + name);
    }
}
