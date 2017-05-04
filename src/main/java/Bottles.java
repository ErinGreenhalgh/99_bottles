
public class Bottles {
    String ofBeer = "of beer";
    String onWall = "on the wall";
    String bottlex = "bottle";
    String plural = "s";
    String noMore = "no more";
    String refrain = "Take one down and pass it around";

    String verse(int startingNumber, int endingNumber) {
        int number = startingNumber;
        String song = "";
        while (number >= endingNumber) {
            //format the first line based on the number
            String num = Integer.toString(number);
            String firstLine;
            if (number == 1) {
                firstLine = num + " " + bottlex + " " + ofBeer + " " + onWall + ", " + num + " " + bottlex + " " + ofBeer + ".\n";
            } else if (number == 0) {
                firstLine = noMore.substring(0,1).toUpperCase() + noMore.substring(1) + " " + bottlex + plural + " " + ofBeer + " " + onWall + ", " + noMore + " " + bottlex + plural + " " + ofBeer + ".\n";
            }
            else {
                firstLine = num + " " + bottlex + plural + " " + ofBeer + " " + onWall + ", " + num + " " + bottlex + plural + " " + ofBeer + ".\n";
            }
            song = song + firstLine;

            //subtract one from the number
            number = number - 1;

            //format the second line based on that number
            String lastLine;
            if (number == 1) {
                lastLine = refrain + ", " + Integer.toString(number) + " " + bottlex + " " + ofBeer +" " + onWall + ".";
            } else if (number == 0) {
                lastLine = "Take it down and pass it around" + ", " + noMore + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
            } else if (number < 0) {
                lastLine = "Go to the store and buy some more, 99" + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
            } else {
                lastLine = refrain + ", " + Integer.toString(number) + " " + bottlex + plural + " " + ofBeer + " "+ onWall + ".";
            }

            //the song always has a double new line between the second line and the new first line
            //but has no double new line at the end
            if (number == endingNumber) {
                song = song + lastLine + "\n\n";
            } else {
                song = song + lastLine;
            }


        }

        return song;
    }

    String verse(int startingNumber) {
        return verse(startingNumber, startingNumber);
    }
}
