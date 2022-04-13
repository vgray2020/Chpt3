package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        //arrayPractice.printOddNumbers();
        //arrayPractice.splitAGivenString();
        arrayPractice.splitAGivenStringIntoSentences();
    }

  public void printOddNumbers () {

      int[] myArrayOfInts = {1,1,2,3,5,8};

      //loop through array and print out each value
      for (int i =0; i < myArrayOfInts.length; i ++) {
          //print out only ODD  -  use % module
          if (myArrayOfInts[i] % 2 == 1){
              System.out.println(myArrayOfInts[i]);
          }

      }
  }

  ///split a given string
    public void splitAGivenString() {
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse";
    //use split method to divide string at each space and store individual words into a NEW array
        String[] mySplitStrings = myProvidedString.split(" ");

        System.out.println(Arrays.toString(mySplitStrings));
    }

    public void splitAGivenStringIntoSentences() {
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse";
        //use split method to divide string at each space and store individual words into a NEW array
        String[] mySplitStrings = myProvidedString.split("\\. ");

        System.out.println(Arrays.toString(mySplitStrings));
    }

}
