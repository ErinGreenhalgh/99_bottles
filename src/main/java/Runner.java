public class Runner {
    public static void main (String [] args ) {
        String ofBeer = " of beer ";
        String onWall = " on the wall";
        String bottlex = " bottle";
//        boolean isPlural = true;
        String plural = "s ";
        String noMore = "no more";
        String firstLine = bottlex + plural + ofBeer;
        String secondLine = "Take one down, pass it around.";

        int number = 3;
        while (number > 0 ) {
            //check if number is 1
            if ( number == 1 ) {
                firstLine = bottlex + ofBeer;
            }

            //print the first two lines of the verse
            System.out.println( number + firstLine + onWall + ", " + number + firstLine);
            System.out.println( secondLine );

            //decrement the number
            number = number - 1;

            //check if the number is 0
            if ( number == 0 ) {
                firstLine = bottlex + plural + ofBeer;
                System.out.println("No more" + firstLine + onWall);
            } else {
                System.out.println(number + firstLine + onWall);
            }
        }
    }
}