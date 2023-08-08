/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q2 {

    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {
    
        /* Creates an album. */
        Album album = new Album("My Photo Album");
        
        /* *******************************************************************
           The following code tests the method insertPicture. */
        insertPicture(album, 40, 60, "1/1/2012", "New Year Party", 'p');
        insertPicture(album, 120, 160, "9/8/2013", "NDP Celebration", 'p');
        insertPicture(album, 150, 120, "12/10/2013", "Hong Kong Airport", 't');
        insertPicture(album, 50, 80, "6/5/2014", "Me and My Cat", 's');
        insertPicture(album, 60, 80, "18/8/2014", "First Day of College", 'o');
        insertPicture(album, 100, 125, "20/8/2014", "Jonathan's Birthday", 'p');
        
        System.out.println("There are now " + album.getNumPictures() + " pictures added.");
        System.out.println();
        
        // /* *******************************************************************
        //    The following code tests the method printNumberOfLargePictures. */
        
        printNumberOfLargePictures(album, 4000);
        
        System.out.println();
        
        /* *******************************************************************
          The following code tests the method printPictureInfo. */
        
        printPictureInfo(album, "Hong Kong Airport");
        printPictureInfo(album, "My Birthday");
        
        System.out.println();
        
        /* ************************************************
           The following code tests the method printNumberOfPicturesByCategory. */        
        
        printNumberOfPicturesByCategory(album);
        
        System.out.println();

        /* ************************************************
           The following code tests the method countPicturesTakenIn. */        

        System.out.println("There are " + countPicturesTakenIn(album, 2013) + " pictures taken in 2013.");
        
    }
    
    // ***********************************************************************
    // This method adds a new Picture object to the specified album. The 
    // various information of the new picture is specified by the parameters.
    // ***********************************************************************
    public static void insertPicture(Album album, int width, int height, String date, String title, char category) {
        // Insert your code here.
        Resolution r = new Resolution(width, height);
        Picture p = new Picture(r, date, title, category);
        album.addPicture(p);
    }
    
    // ***********************************************************************
    // This method prints the number of pictures in the specified album 
    // whose resolution (number of pixels) is equal to or greater than the
    // specified number of pixels. Refer to the sample output for the exact
    // output of this method.
    // ***********************************************************************    
    public static void printNumberOfLargePictures(Album album, int numPixels) {
        // Insert your code here.
        int total_pics = album.getNumPictures();
        int smaller = album.getNumPicturesWithFewerPixelsThan(numPixels);
        System.out.println("There are " + (total_pics - smaller) + " pictures with at least " + numPixels + " pixels.");

    }

    // ***********************************************************************
    // This method looks for a picture with the specified title in the 
    // specified album. If such a picture is found, the method prints out the
    // date the picture was taken and its number of pixels. If such a picture 
    // cannot be found in the specified album, the method prints out a message. 
    // See the sample run of the program for the exact output of this method.
    // ***********************************************************************
    public static void printPictureInfo(Album album, String title) {
        // Insert your code here.
        Picture p = album.getPicture(title);
        if (p == null) {
            System.out.println("The picture titled " + title + " cannot be found in the album titled " + album.getTitle() + ".");
        } else {
            System.out.println("The picture titled " + title + " was taken on " + p.getDate() + " and has " + p.getResolution().getNumPixels() + " pixels.");
        }
    }
    
    // ***********************************************************************
    // This method first prompts the user for a single character that 
    // represents a category. You can assume that the user will always enter
    // 'p', 't', 's' or 'o'. The method then prints out the number of pictures
    // inside the specified album of the user-entered category. See the sample
    // run of the program for exact output of the method. In particular, the
    // method needs to display a category "party", "travel", "selfie" or 
    // "other" based on the user's input.
    // ***********************************************************************
    public static void printNumberOfPicturesByCategory(Album album) {
        // Insert your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter picture category: ");
        String c = sc.nextLine();
        
        System.out.println("There are " + album.getNumPicturesOfCategory(c.charAt(0)) + " pictures of the category party in this album.");
    }
    

    // ***********************************************************************
    // This method returns the number of pictures which were taken in the
    // specified year in the specified album. For example, if year is 2000 and
    // there are two pictures in the specified album that were taken in 2000
    // (regardless of month and day), then this method should return 2.
    // ***********************************************************************
    public static int countPicturesTakenIn(Album album, int year) {
        // Modify the code below to return the correct value.
        int total = 0;
        for (int i = 1; i<13; i++) {
            String monthAndYear = i + "/" + year;
            total += album.getNumPicturesTakenIn(monthAndYear);
        }
        
        return total;
    }
}