package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void problem1() {
        String[][] statesAndCapitals = StatesAndCapitals.get2DArray();
        String[][] sorted = new BubbleSort().bubbleSort(statesAndCapitals);
        System.out.println(Arrays.deepToString(sorted));
        String query = "What is the capital of ";
        int correctAnswers = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sorted.length; i++) {
//          The IDE keeps suggesting I make an 'enhanced' for loop. It is not as wordy but also not as clear, so I opted
//          out of that. The syntax here works just fine and is also the same as in javascript minus the int keyword.
            System.out.print("Score: ");
            System.out.println(correctAnswers);

            String state = sorted[i][0];
            String capital = sorted[i][1];

            String question = query + state;
            System.out.println(question);

//          This one has no text variable on the outside of the loop. I think this way is cleaner.
            if (scan.hasNext()){
                String answer = scan.next();
                if (answer.equalsIgnoreCase(capital)) {
                    correctAnswers++;
                };
            }
        };
    }
}
