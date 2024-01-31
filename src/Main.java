
public class Main {

    public static void main(String[] args) {

        Animals askal = new Dog();
        Animals pusakal = new Cat();

        askal.setName("Dog");
        pusakal.setName("Kuting");

        Animals[] animals = new Animals[2];
        animals[0] = askal;
        animals[1] = pusakal;

        for(Animals var: animals){
            System.out.println(var.getName()+" is Good?: " + var.getisGood());
        }
//        System.out.println(askal.getName()+" is Good?: " + askal.getisGood());
//        System.out.println(pusakal.getName()+" is Good?: " + pusakal.getisGood());
//        the Animal class can only read the method inside the animal class
//        the Animal class can read the static methods
        isHeGood(askal);
        isHeGood(pusakal);

        pusakal.AnimalName();
        askal.AnimalName();

        Creature human = new Human();
        Creature person = new Human();

        human.setName("Melanio");
        human.setAge(23);

        person.setName("flores");
        person.setAge(123);

        System.out.println(human.getName() + " " + human.getAge());

        System.out.println(person.getName()+ person.getAge());
    }


    public static void isHeGood(Animals animal){
        System.out.println("Is he good? " + animal.getisGood());
    }
}
