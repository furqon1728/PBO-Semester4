package praktikum.pertemuan4;

public class Bingo {
    int clap;
    public Bingo(int clap){
        this.clap = clap;
        
//        membuat switch case
        switch (clap){
            case 1:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("B-I-N-G-O\nB-I-N-G-O\nB-I-N-G-O");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            case 2:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("(clap)-I-N-G-O\n(clap)-I-N-G-O\n(clap)-I-N-G-O");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            case 3:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            case 4:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            case 5:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            case 6:
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)\n(clap)-(clap)-(clap)-(clap)-(clap)\n(clap)-(clap)-(clap)-(clap)-(clap)");
                System.out.println("And Bingo was his name-o.");
                System.out.println("");
                break;

            default:
                System.out.println("BINGO!!!");

        }
    }

}
