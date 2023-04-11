package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void problem1() {
        String query = "What is the capital of ";

//      Pulling the States and capitals into a 2DArray for further processing.
        String[][] statesAndCapitals = StatesAndCapitals.get2DArray();
//      Using Bubble Sort Class to sort the states and capitals by the name of the capital.
        String[][] sorted = new BubbleSort().bubbleSort(statesAndCapitals);
//      Displaying the contents of the sorted Array.
        System.out.println(Arrays.deepToString(sorted));

//      Keeping track of the correct answers.
        int correctAnswers = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sorted.length; i++) {
/*
          The IDE keeps suggesting I make an 'enhanced' for loop. It is not as wordy but also not as clear, so I opted
          out of that. The syntax here works just fine and is also the same as in javascript minus the int keyword.

          For each of the items in the Array, state and capital variables are set to their respective locations in the
          inner array or the 2nd dimension.
          The query variable was created just to make things a bit cleaner in the logic
 */
            System.out.print("Score: ");
            System.out.println(correctAnswers);

//          state is stored in the current index's array at the 0th index and capital at index 1.
            String state = sorted[i][0];
            String capital = sorted[i][1];

            String question = query + state;
            System.out.println(question);

//          This one has no text variable on the outside of the loop. I think this way is cleaner than the 2nd implementation.
            if (scan.hasNext()){
//              if there is something that was written then we'll care about it and take that as an answer. Otherwise do nothing with it.
                String answer = scan.next();
                if (answer.equalsIgnoreCase(capital)) {
//                  If the text and the capital match (regardless of case) then answers will be tallied.
                    correctAnswers++;
                };
            }
        };
    }
}
