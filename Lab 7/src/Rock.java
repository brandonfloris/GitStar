import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {

        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine
        // computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("(R)ock, (P)aper, or (S)cissors: "); // Get player's
                                                              // play -- note
                                                              // that this is
                                                              // stored as a
                                                              // string
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase(); // Make player's play uppercase
                                               // for ease of comparison
        computerInt = generator.nextInt(3);// Generate computer's play (0,1,2)
        computerPlay = computerInt + "";// Translate computer's randomly
                                        // generated play to string

        switch (computerInt) {
        case 0:
            computerPlay = "R";
            break;
        case 1:
            computerPlay = "P";
            break;
        case 2:
            computerPlay = "S";
            break;
        }

        System.out.println("The computer chose: " + computerPlay);// Print
                                                                  // computer's
                                                                  // play
        // See who won. Use nested ifs instead of &&.

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else
                System.out.println("Paper covers rock. You lose.");

        if (personPlay.equals("P"))
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You Win!!");
            else
                System.out.println("Scissors cut paper. You lose.");

        if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cut paper. You win!!");
            else
                System.out.println("Rock crushes scissors. You lose.");

        /*
         * if (personPlay.equals("R") && computerPlay.equals("P"))
         * System.out.println("Paper covers rock. You lose."); else if
         * (personPlay.equals("R") && computerPlay.equals("S"))
         * System.out.println("Rock crushes scissors. You win!!");
         * 
         * if (personPlay.equals("P") && computerPlay.equals("S"))
         * System.out.println("Scissors cut paper. You lose."); else if
         * (personPlay.equals("P") && computerPlay.equals("R"))
         * System.out.println("Paper covers rock. You Win!!");
         * 
         * if (personPlay.equals("S") && computerPlay.equals("R"))
         * System.out.println("Rock crushes scissors. You lose."); else if
         * (personPlay.equals("S") && computerPlay.equals("P"))
         * System.out.println("Scissors cut paper. You win!!");
         */
    }
}