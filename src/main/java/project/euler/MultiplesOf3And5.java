package project.euler;

import java.util.Set;
import java.util.TreeSet;

/**
 * Problemdescription: If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author bayerlma
 */
public class MultiplesOf3And5 {

  private final Set<Integer> allMultiples = new TreeSet<Integer>();

  public int sumOfMultiples(final int firstNumber, final int secondNumber, final int limit) {
    int sum = 0;

    calculation(firstNumber, limit);
    calculation(secondNumber, limit);

    for(final Integer i : allMultiples){
      sum += i;
    }
    return sum;
  }

  public void calculation(final int number, final int limit) {
    for(int i = 0; i  < limit;i++){
      final int currentNumber = number*i;
      if(currentNumber < limit){
        allMultiples.add (currentNumber);
        System.out.println("Found number: " + currentNumber);
      } else {
      }
    }
  }

  public static void main(final String[] args) {
    final MultiplesOf3And5 instance = new MultiplesOf3And5();
    System.out.println (instance.sumOfMultiples(3,5,1000));
  }
}
