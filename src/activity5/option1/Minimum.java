package activity5.option1;

public class Minimum {
  // make a variable and replace it as you go down the row

  private int findSmallest (int[] n){
    int minNum = 0;
    for (int i = 0; i < n.length; i++){
      if (n[i] < minNum)
        minNum = n[i];
    }
    System.out.println(minNum);
  }

  public static void main (String [] args){
    int[] numbers = {1, 3, 5, 2, 10};
    Minimum number = new Minimum();
    number.findSmallest(numbers);
  }
}
