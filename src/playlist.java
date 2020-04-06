public class playlist
{
    //1 instance variabls
    private song[] playlist;
    private int countSong = 0;
    //2 Constructor
    public playlist()
    {
        playlist = new song[4];
    }//end zero arg constructor

    //6 Brain Method
    public void addSong (song aSong)
    {
        if(countSong == playlist.length)
        {
            increaseSize();
        }//end check to see if need to increase size of Playlist
        playlist[countSong] = aSong;
        countSong++;
    }//end method to add a song to the playlist


    private void increaseSize()
    {
        song[] temp = new song[playlist.length * 2];

        for (int s = 0; s < playlist.length;s++)
        {
            temp[s] = playlist[s];
        }//end loop moving songs from the 1st to 2nd playlist
        playlist = temp; //changes the name of the temp to playlist
    }//end method to double length of array Playlist
    //3 toString
    public String toString()
    {
        String output = "----------My Playlist--------- \n ";
        for (int s = 0; s < countSong; s++)
        {
            output += playlist[s].toString() + "\n";
            output += "\n------------\n";
        }//end for loop
        return output;
    }//end toString
}//end class Playlist
