import java.util.ArrayList;

public class List {

    // features associated with it:

    int length;
    ArrayList<Integer> listContent;
    double averageOfOdds;

    // constructor to create instances:

    public List(int length) {
        this.length = length;
    }

    //methods associated with it:
    //1. to create a list of random numbers based on a given list length

    public void createList() {
        int itemNumber = 0;
        listContent = new ArrayList<>(length);
        while (itemNumber < length) {
//             creating a random number per each loop between -25 and 25.
            int randomNumber = (int) (Math.random() * 50 - 25);
            listContent.add(itemNumber, randomNumber);
            itemNumber++;
        }
        System.out.println("List: " + listContent);
    }

    //2. to calculate the average of the odd numbers on this list

    public void generateAverage() {
        int itemNumberFull = 0;
        int itemNumberOdd = 0;
        // listOfOddNumbers is created to keep track of the odd numbers locally. It's an ArrayList of Integers,
        // to be able to keep adding to it, which we can't do with int arrays (predefined length).
        ArrayList<Integer> listOfOddNumbers = new ArrayList<>(itemNumberOdd);
        double oddsSum = 0;

        while (itemNumberFull < length) {
            // if the given number on the list is odd:
            if ((listContent.get(itemNumberFull) % 2 == 1) || (listContent.get(itemNumberFull) % 2 == -1)) {
                oddsSum = oddsSum + listContent.get(itemNumberFull);
                listOfOddNumbers.add(itemNumberOdd, listContent.get(itemNumberFull));
                itemNumberFull++;
                itemNumberOdd++;
            }
            // if the given number on the list is even:
            else {
                itemNumberFull++; // to move onto the next element on the list
            }

        }

        averageOfOdds = oddsSum / listOfOddNumbers.size();
        System.out.println("The average of the odd numbers is: " + averageOfOdds);
    }
}
