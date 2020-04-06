public class SongDriver
{
    public static void main(String args[])
    {

        //1. Create a Song, or more
        song someSong = new song();
        song fireworks = new song("Fireworks","Katy Perry",true, 234, 6.94);
        song deadLochs = new song("DeadLochs", "Blue Face", true, 150, 3.57 );
        song overture = new song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1093,11.11);
        song happySong = new song( "happysong", "Moi", true);
//        song happySong2 = new song( "happysong", "Moi", true);
//        song happySong3 = happySong;


        playlist myPlaylist = new playlist();
        myPlaylist.addSong(fireworks);
        myPlaylist.addSong(deadLochs);
        myPlaylist.addSong(overture);
        myPlaylist.addSong(someSong);
        myPlaylist.addSong(happySong);
        System.out.println(myPlaylist.toString());


//     if (happySong == happySong2)
//     {
//         System.out.println("They are the same");
//     }
//     else
//     {
//         System.out.println("They are NOT the same");
//     }//end else
//        if(happySong == happySong3)
//        {
//            System.out.println("They are the same");
//        }
//        else
//        {
//            System.out.println("They are NOT the same");
//        }//end else
//
//        System.out.println("There are " + song.getCount() + "songs on this list.");

        // fireworks.title = "Happy Song";
        // System.out.println(fireworks);
/*
        //3 Testing getters
        System.out.println(fireworks.getTitle());
        System.out.println(deadLochs.getArtist());
        System.out.println(overture.getHasLyrics());

        System.out.println("In minutes: " +overture.toMinSec());

        //Testing Setters
//        System.out.println("\n" + someSong + "\n");
//        someSong.setTitle("Lalalalala");
//        someSong.setArtist("A Singer");
//        System.out.println(someSong);


        //2.Print it out
        System.out.println(happySong);
//        System.out.println(fireworks);
  //      System.out.println();
    //    System.out.println(deadLochs);
      //  System.out.println("\n" + overture);
*/
    }//end main method



}//end Class SongDriver.  This is where all the fun stuff happens.


