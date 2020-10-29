package ss1;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFiveNumbers = new ArrayList<>();
        firstFiveNumbers.add(2);
        firstFiveNumbers.add(3);
        firstFiveNumbers.add(5);
        firstFiveNumbers.add(7);
        firstFiveNumbers.add(11);

        //Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFiveNumbers);

        List<Integer> nexFivePrimeNumbers = new ArrayList<>();
        nexFivePrimeNumbers.add(13);
        nexFivePrimeNumbers.add(17);
        nexFivePrimeNumbers.add(19);
        nexFivePrimeNumbers.add(23);
        nexFivePrimeNumbers.add(29);

        firstFiveNumbers.addAll(nexFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
