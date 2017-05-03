
public class Bottles {
    String ofBeer = "of beer";
    String onWall = "on the wall";
    String bottlex = "bottle";
    String plural = "s";
    String noMore = "no more";
    String refrain = "Take one down and pass it around";

    String verse(int numberOfBottles) {
        String number = Integer.toString(numberOfBottles);
        String firstLine;
        if (numberOfBottles == 1) {
            firstLine = number + " " + bottlex + " " + ofBeer + " " + onWall + ", " + number + " " + bottlex + " " + ofBeer + ".\n";
        } else if (numberOfBottles == 0) {
            firstLine = noMore.substring(0,1).toUpperCase() + noMore.substring(1) + " " + bottlex + plural + " " + ofBeer + " " + onWall + ", " + noMore + " " + bottlex + plural + " " + ofBeer + ".\n";
        }
        else {
            firstLine = number + " " + bottlex + plural + " " + ofBeer + " " + onWall + ", " + number + " " + bottlex + plural + " " + ofBeer + ".\n";
        }


        int numberMinusOne = numberOfBottles - 1;
        String lastLine;
        if (numberMinusOne == 1) {
            lastLine = refrain + ", " + Integer.toString(numberMinusOne) + " " + bottlex + " " + ofBeer +" " + onWall + ".";
        } else if (numberMinusOne == 0) {
            lastLine = "Take it down and pass it around" + ", " + noMore + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
        } else if (numberMinusOne < 0) {
            lastLine = "Go to the store and buy some more, 99" + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
        } else {
            lastLine = refrain + ", " + Integer.toString(numberMinusOne) + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
        }

        return firstLine + lastLine;
    }
}
