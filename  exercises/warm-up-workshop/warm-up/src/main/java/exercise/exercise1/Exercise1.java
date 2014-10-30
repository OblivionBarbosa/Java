package exercise.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 10/28/2014.
 *
 * Exercise 1: Compute the sum, the minimum and the maximum element from a given list (givenList) using three
 *             different ways to iterate over a List:
 *             a) ListIterator (implement it in the iterateUsingListIterator() method)
 *             b) for loop (implement it in the iterateUsingForLoop() method)
 *             c) foreach loop (implement it in the iterateUsingForEachLoop() method)
 *
 *             In order to test your implementations you need to run the Exercise1Test from the test/java package
 *             (right-click on Exercise1Test class then click Run 'Exercise1Test' )
 */
public class Exercise1{
    private List<Integer> givenList;

    public Exercise1(List l) {
       this.givenList = l;
    }

    // TODO Exercise #1 a) Compute sum and get the min and the max from list iterating through it using ListIterator
    public List<Integer> iterateUsingListIterator(){

        Integer sum;
        Integer max=Integer.MIN_VALUE;
        Integer min=Integer.MAX_VALUE;


        ListIterator<Integer> it2 = givenList.listIterator();

        sum=0;
        while(it2.hasNext()){


            Integer var1 = it2.next();
            sum+= var1;

            if (var1>max){
                max=var1;
            }

            if (var1<min){
                min=var1;
            }

        }

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();
        // TODO Exercise #1 a1) In order to pass the tests you need to name your variables sum, min and max or if
        // TODO Exercise #1 a1) you want to name them differently you need to modify when you add them to testValues

        // Adding the results to the List in order to be tested
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #0 b) Compute sum and get the min and the max from list iterating through it using for loop
    public List<Integer> iterateUsingForLoop(){

        Integer sum;
        Integer max=Integer.MIN_VALUE;
        Integer min=Integer.MAX_VALUE;

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();

        sum=0;
        for(int i=0; i<givenList.size(); i++){

            sum += givenList.get(i);

            if (givenList.get(i)>max){
                max=givenList.get(i);
            }

            if (givenList.get(i)<min){
                min=givenList.get(i);
            }

        }

        // Adding the results to the List in order to be tested
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #0 c) Compute sum and get the min and the max from list iterating through it using foreach loop
    public List<Integer> iterateUsingForEachLoop(){

        Integer sum;
        Integer max=Integer.MIN_VALUE;
        Integer min=Integer.MAX_VALUE;

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();

        sum=0;

        for(Integer element:givenList) {

            sum += element;

            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }
        }

        // Adding the results to the List in order to be tested
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }
}
