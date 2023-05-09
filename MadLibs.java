/*
 * In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

Mad Libs require:

A short story with blank spaces (asking for different types of words).
Words from the player to fill in those blanks.


public class MadLibs {
  /*
  This programs generates a mad libbed story.
   Author: Elizabeth
   Date: 5/9/2023

  */


public class MadLibs {
  /*
  This programs generates a mad libbed story.
   Author: Elizabeth
   Date: 5/9/2023
  
  */
  public static void main(String[] args) {
    String name1 = "Snipper";
    String adjective1 = "grouchy";
    String adjective2 = "horrible";
    String adjective3 = "annoying";
    String verb1 = "clap";
    String noun1 = "young kid";
    String noun2 = "fidget spinners";
    String noun3 = "beat";
    String noun4 = "ruckus";
    String noun5 = "turd";
    String noun6 = "monkey";
    String name2 = "Calvin";
    int number = 100;
    String place1 = "Neptune";

    //The template for the story
    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
        + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
        + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
        + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
        + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". "
        + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

    System.out.println(story);
  }
}

/*
 * output 
 * 
 * This morning Snipper woke up feeling grouchy. 'It is going to be a horrible day!' 
 * Outside, a bunch of young kids were protesting to keep fidget spinners in stores. 
 * They began to clap to the rhythm of the beat, which made all the ruckus very annoying.
 *  Concerned, Snipper texted Calvin, who flew Snipper to Neptune and dropped Snipper in a 
 * puddle of frozen turd. Snipper woke up in the year 100, in a world where monkeys ruled the world.
 */


  	