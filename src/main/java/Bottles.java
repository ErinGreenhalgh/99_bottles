/**
 * Created by ErinGreenhalgh on 5/2/17.
 */
public class Bottles {
    String verse(int numberOfBottles) {
        String number = Integer.toString(numberOfBottles);
        String numberMinusOne = Integer.toString(numberOfBottles - 1);
        return number + " bottles of beer on the wall, " + number + " bottles of beer." +
                "\nTake one down and pass it around, " + numberMinusOne +
                " bottles of beer on the wall.";
    }
}
