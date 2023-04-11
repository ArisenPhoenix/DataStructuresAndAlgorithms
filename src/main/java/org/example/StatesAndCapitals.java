package org.example;
import java.util.HashMap;

public class StatesAndCapitals {
//    This module was created to keep the code clean and to reuse it across the two problems.
    static String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California",
            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana",
            "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
            "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico"
            , "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
            "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
            "West Virginia", "Wisconsin", "Wyoming"};

    static String[] capitals = {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver"
            , "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines"
            , "Topeka", "Frankfurt", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "St. Paul",
            "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe",
            "Albany", "Raleigh", "Bismarck", "columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence",
            "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia",
            "Carleston", "Madison", "Cheyenne"};

    public static String[][] get2DArray(){
        String[][] statesAndCapitals = new String[50][2];
        for (int i = 0; i < states.length; i++) {
            String[] pair = new String[]{states[i], capitals[i]};
            statesAndCapitals[i] = pair;
        }
        return statesAndCapitals;
    };

    public static HashMap<String, String> getMap(){
        HashMap<String, String> hash = new HashMap<>();
        for (int i = 0; i < states.length; i++) {
            String state = states[i];
            String capital = capitals[i];
            hash.put(state, capital);
        }
        return hash;
    };
}
