package org.example;
import java.util.*;

public class Problem2 {
    public static void problem2() {
        String q = "Type a US State's name or just press 'Enter' to finish.";

//      Has map was put into a separate section for cleaner code.
        HashMap<String, String> statesAndCapitals = StatesAndCapitals.getMap();
        System.out.println("The contents of the Hash Map: ");
        System.out.println(statesAndCapitals);

//      The requested data structures are  below.
        BinarySearchTree bin = new BinarySearchTree();
        TreeMap<String, String> tree = new TreeMap<>(statesAndCapitals);

        int counts = 0;
        while(!tree.isEmpty()){
            Map.Entry<String, String> stateData = tree.pollFirstEntry();
            if (stateData != null){

                String state = stateData.getKey();
                String capital = stateData.getValue();
/*
                Counts are used to display the number of the state. Nice to have a bit of formatting when using the
                console as a gui. Also, later, they are used to ensure the loop below ends after all items have been
                accounted for

 */
                System.out.print(counts);
                System.out.println(" " + state + " " + capital);

/*
              I assume this is what is meant by 'while using a binary tree for storage' in Part 2 requirements.
              This does the effect of making the binary search tree useless though because they are already organized
              and I did not make a self-balancing binary tree. But all functionality requested is here.
 */
                bin.insert(stateData);
            }
        counts++;
        }

        int count = 0;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (text != null && count < counts){
//          Must use count because the Tree Map is empty by now from polling.
            count++;
            if (!text.isEmpty()){
                System.out.println(q);
                BinarySearchTree.Node requestedCapital = bin.find(text);
                if (requestedCapital != null && requestedCapital.data != null){
                    System.out.print("The Capital of " + text + " is: ");
                    System.out.println(requestedCapital.data.getValue());
                    if (scan.hasNextLine()){
                        text = scan.nextLine();
                    } else {
                        text = null;
                    }
                }
            }
        }
        System.out.println("Exiting...");
    };
}

