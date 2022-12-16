import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowRunner {
    public static void main(String[] args) {

        TVShow[] showsList = new TVShow[17];

        //read from file and store into the array
        //this is a try/catch block with resources
        //this means that these things are automatically closed for us when
        //we are done using them
        //we do not need to close the objects on our own
        //each object we make within the () is separated by a ;
        try(){

            //we store data into a line variable within the while loop condition
            //because each time we call readLine it is pulling a line from the textfile
            //so if we did not do this with the while loop then we would miss lines
            //everything we pull from the textfile is a String unless we convert
            //it to something else later so even if we are reading out a number
            //from the file it will be read out as a String

            //inside the while loop we are using the .split() method
            //this method will split a string by whatever we place inside
            //the (), then it will place each of those sections into an
            //index location in a String[]



        } catch() {

        } catch () {

        }

        System.out.println("Test to see if the array is filled");
        printArr(showsList);

        //find all the comedy tv shows

        //find all the tv shows on a specific "network"
        //   we will use Netflix for the example

        //OPTIONAL EXTRA PRACTICE
        //we have the TVShow[] filled see
        //using this array we should be able to display to
        //the user the following info
        //      find the tv show with the most episodes
        //      find the tv show with the fewest episodes

    }

    public static void printArr(TVShow[] showsArray) {
        for (TVShow show : showsArray) {
            System.out.println(show);
        }
    }

    public static TVShow[] findComedy (TVShow[] showsArray) {

    }

    public static TVShow[] networkShows (TVShow[] showsArray, String network) {

    }
}
