package praktikum.pertemuan4;

public class refBingo {
    public static void main (String[] args) {

        // The first for loop, to take care of each verse
        for (int claps = 0; claps <= 5; claps++) {

            // These phrases are repeated verbatim every single time
            // with only the verse number changing
            System.out.println("VERSE " + (claps + 1));
            System.out.println("");
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            // The second for loop, taking care of the clapping and
            // spelling of BINGO
            for (int times = 0; times < 3; times++) {

                // Uh oh, a switch without breaks!  The number of
                // claps increases by one as the song progresses,
                // therefore an acumulative switch statement
                // in descending order fits the bill.
                switch(claps) {
                    case 5: System.out.print("CLAP! ");
                    case 4: System.out.print("CLAP! ");
                    case 3: System.out.print("CLAP! ");
                    case 2: System.out.print("CLAP! ");
                    case 1: System.out.print("CLAP! ");
                }

                // Another switch without breaks!  Now as the number
                // of verses increases, the letters are replaced with
                // claps. We use another switch statement where one
                // less letter is printed out each time.
                switch(claps) {
                    case 0: System.out.print("B ");
                    case 1: System.out.print("I ");
                    case 2: System.out.print("N ");
                    case 3: System.out.print("G ");
                    case 4: System.out.print("O ");
                }

                // End of each inner loop, you should add on a
                // comma for the English majors in the croud.
                System.out.println(",");
            }

            // Finally, we print out the last line of each verse.
            System.out.println("And Bingo was his name-o.");
            System.out.println("");
        }
    }
}
