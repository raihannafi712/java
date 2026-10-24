//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){                   /* Check notes to understand visually */

        int row_size = arena.length;
        int col_size = arena[0].length;
        int total_points = 0;

        for (int i = 0; i < row_size; i++) {
            
            for (int j = 0; j < col_size; j++) {

                if (arena[i][j] % 50 == 0 && arena[i][j] != 0  ) {

                    int player_points = 0;                                  /* More than one player so each player count has points */

                    if (j - 1 >= 0 && arena[i][j - 1] == 2) {                /* left check */
                        player_points += 1;
                    }
                    if (j + 1 < col_size && arena[i][j + 1] == 2) {          /* Right check */
                        player_points += 1;
                    }
                    if (i - 1 >= 0 && arena[i - 1][j] == 2) {                /* Up check */
                        player_points += 1;
                    }
                    if (i + 1 < row_size && arena[i + 1][j] == 2) {          /* Down check */
                        player_points += 1;
                    }
                    total_points += player_points;
                }
                
            }
        }

        total_points = (total_points*2);

        System.out.print("Points gained: " + (total_points) + ".");
        if (total_points >= 10) {
            System.out.println("Your team has survived the game");
        } else {
            System.out.println("Your team is out");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
