import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Adding a value inside the array
        int[] NumColl = {1,2,3,4,5,6};
        int[] Numbers = new int[4];
        Numbers[0] = 1;
        Numbers[1] = 2;
        Numbers[2] = 3;
        Numbers[3] = 4;
        for(int number: Numbers) System.out.println(number);
        for(int number: NumColl) System.out.println(number);

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Sample1");
//        arrayList.add("Sample2");
//        arrayList.add("Sample3");
//        arrayList.add("Sample4");

        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList(
                        "Melares",
                        "123",
                        "Doup"
                )
        );

//        Getting the index of an array
        System.out.println(Numbers[0]); // 1
        System.out.println(arrayList.get(0)); // Melares

//        Getting the Size of the array
        System.out.println(Numbers.length);
        System.out.println(arrayList.size());

//        Adding an Element In an Array
        //You cant add new elements inside an Array, but you can at Array List
        arrayList.add("Mouse");
        System.out.println(arrayList.get(3)); // Mouse

        // Updating an Array element
        Numbers[0] = 10;
        System.out.println(Numbers[0]); // 10

        arrayList.set(0,"Melanio");
        System.out.println(arrayList.get(0)); // Melanio

        // Removing an Element
        // Cant do it with Arrays
        arrayList.remove(0);
        System.out.println(arrayList);

        // Printing the Array
//        System.out.println(Numbers);
        for (int num : Numbers) System.out.printf(num + " ");
        System.out.println(arrayList);


    }


}
