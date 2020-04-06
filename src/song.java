public class song {
    //1) Instance Variables
    private String title;
    private String artist; // can also be composer
    private boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megaBytes
    private static int count =0; //number of songs in my playlist

    //2) Constructors
    //Overloaded constructors (methods) have early binding
    public song() {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end zero-arg or default constructor

    public song(String newTitle, String newArtist, boolean newHasLyrics) {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end three-arg constructor

    public song(String title, String artist, Boolean HasLyrics, int Length, double FileSize) {
        this.title = title;
        this.artist = artist;
        this.hasLyrics = HasLyrics;
        this.length = checkLength(Length);
        this.fileSize = FileSize;
        count++;
    }//end multi-arg constructor


    //4 Getters
    public static int getCount()
    {
        return count;
    }
    public String getTitle() {
        return title;
    }//title getter

    public String getArtist() {
        return artist;
    }//artist getter

    public boolean getHasLyrics() {
        return hasLyrics;
    }//hasLyrics getter

    public int length() {
        return length;
    }//length getter

    public double fileSize() {
        return fileSize;
    }//fileSize getter

    //4 Setters
    public void setTitle(String newTitle) {
        title = newTitle;
    }//end Title setter

    public void setArtist(String newArtist) {
        artist = newArtist;
    }

    public void setHasLyrics(boolean newHasLyrics) {
        hasLyrics = newHasLyrics;
    }
    //Pre-Condition: The object exists
    //Post-Condition: length == newLength validated to (0,20)
    public void setLength(int newlength)
    {
        length = checkLength(newlength);
    }

    public void setFileSize(double newFileSize)
    {
        fileSize = newFileSize;
    }

    //6 Brain Methods
    public int compareTo(song someSong)
    {
        if (this.length < someSong.length)
        {
            return -1;
        }
        else if (this.length == someSong.length)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }//end compareTo implemented from interface Comparable
    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
       return minutes + "min" + seconds + "sec";
    }//end brain method to convert length

    /*
    CheckLength is a helper method. it is private because
    it "helps" the other public methods by validating entry
    This is an example of method decomposition - each method does
    just one thing.
     */

    private int checkLength(int newLength)
    {
        int templength = newLength;
        if (templength < 0)
        {
            templength = 0;
        }//end if
        else if (templength > 1200)
        {
            templength = 1200;
        }//end else if
        return templength;
    }//end length validation method checkLength)
    //3. toString a must have for every great object class
    public String toString()
    {
        String output = "";
        output += "Title:" + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics?: " + hasLyrics;
        output += "\nLength (in seconds): " + length;
        output += "\nFile Size (in mB): " + fileSize;

        return output;
    }//end toString
}//end class song


