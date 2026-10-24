//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        int row_s_main = arena.length;
        int col_s_main = arena[0].length;

        int total_points = 0;

        for (int i = 0; i < row_s_main; i++) {
            
            for (int j = 0; j < col_s_main; j++) {

                if (arena[i][j] % 50 == 0 && arena[i][j] != 0  ) {

                    int per_player_p = 0;                                 

                    if (j - 1 >= 0 && arena[i][j - 1] == 2) {               
                        per_player_p += 1;
                    }
                    if (j + 1 < col_s_main && arena[i][j + 1] == 2) {         
                        per_player_p += 1;
                    }
                    if (i - 1 >= 0 && arena[i - 1][j] == 2) {               
                        per_player_p += 1;
                    }
                    if (i + 1 < row_s_main && arena[i + 1][j] == 2) {         
                        per_player_p += 1;
                    }

                    total_points += per_player_p;
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
