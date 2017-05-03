
public class Bottles {
    String ofBeer = "of beer";
    String onWall = "on the wall";
    String bottlex = "bottle";
    String plural = "s";
    String noMore = "no more";
    String refrain = "Take one down and pass it around";

    String verse(int numberOfBottles) {
        String number = Integer.toString(numberOfBottles);
        String firstLine = number + " " + bottlex + plural + " " + ofBeer + " " + onWall + ", " + number + " " + bottlex + plural + " " + ofBeer + ".\n";

        int numberMinusOne = numberOfBottles - 1;
        String lastLine;
        if (numberMinusOne == 1) {
            lastLine = refrain + ", " + Integer.toString(numberMinusOne) + " " + bottlex + " " + ofBeer +" " + onWall + ".";
        } else {
            lastLine = refrain + ", " + Integer.toString(numberMinusOne) + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
        }

        return firstLine + lastLine;
    }
}
