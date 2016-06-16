package project.euler;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author bayerlma
 *
 */
public class LargestPalindromeProduct
{

  public int calculateThreeDigits(){
    int result = 0;
    int firstNumber = 100;
    int secondNumber = 100;

    for(int i = 0; i < 899; i++){
      for(int j = 0; j < 899; j++){
        final int helper = checkNumber(firstNumber,  secondNumber);
        if(helper != 0 && helper > result){
          result = helper;
          System.out.println (result + " " + firstNumber + " " + secondNumber);
        }
        secondNumber++;

      }
      secondNumber = 100;
      firstNumber++;
    }

    return result;
  }
  private int checkNumber (final int firstNumber, final int secondNumber)
  {
    final Integer check = firstNumber * secondNumber;
    final String checking = check.toString ();
    if (checking.length () == 5){
      if(checking.substring (0, 2).equals (new StringBuilder(checking.substring (3, 5)).reverse ().toString ())){
        return check;
      }
    }else{
      if(checking.substring (0, 3).equals (new StringBuilder(checking.substring (3, 6)).reverse ().toString ())){
        return check;
      }
    }
    return 0;
  }

  public static void main(final String[] args) {
    final LargestPalindromeProduct instance = new LargestPalindromeProduct();
    System.out.println (instance.calculateThreeDigits());
  }
}
