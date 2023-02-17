/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone.simulator;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Dell-User
 */
public class DroneSimulator {

    static String[] board;
    static String Drone;
    static int x =0;
    static int y=0;
    //static String initialPosition= x+","+ y +","+ F;
   // static String currentPosition;
    //static String F = "N";
    
 /*   static String checkAction()
    {
        for(int a = 0; a < 10; a++)
        {
            String line = null;
            
            switch(a){
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                    
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                    
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;       
            }
            if (line.equals("XXX")) {
                return "X";
            }
            
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
    }
   */ 
    
    static void printBoard()
    {
        System.out.println("|-----|---|---|---|---|---|---|---|---|---|----|");
        System.out.println(" | " + board[0] + " | "
                           + board[1] + " | " + board[2]
                           + "  |  "+ board[3] + " | "
                           + board[4] + " | " + board[5]
                           + " | "+ board[6] + "  |  "
                           + board[7] + " | " + board[8]
                           + "  | "+ board[9] + " |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[10] + " | "
                           + board[11] + " | " + board[12]
                           + " |"+ board[13] + " | "
                           + board[14] + " | " + board[15]
                           + " |"+ board[16] + " | "
                           + board[17] + " | " + board[18]
                           + " |"+ board[19] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[20] + " | "
                           + board[21] + " | " + board[22]
                           + " |" + board[23] + " | "
                           + board[24] + " | " + board[25]
                           + " |"+ board[26] + " | "
                           + board[27] + " | " + board[28]
                           + " |"+ board[29] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[30] + " | "
                           + board[31] + " | " + board[32]
                           + " |" + board[33] + " | "
                           + board[34] + " | " + board[35]
                           + " |"+ board[36] + " | "
                           + board[37] + " | " + board[38]
                           + " |"+ board[39] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[40] + " | "
                           + board[41] + " | " + board[42]
                           + " |" + board[43] + " | "
                           + board[44] + " | " + board[45]
                           + " |"+ board[46] + " | "
                           + board[47] + " | " + board[48]
                           + " |"+ board[49] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[50] + " | "
                           + board[51] + " | " + board[52]
                           + " |" + board[53] + " | "
                           + board[54] + " | " + board[55]
                           + " |"+ board[56] + " | "
                           + board[57] + " | " + board[58]
                           + " |"+ board[59] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[60] + " | "
                           + board[61] + " | " + board[62]
                           + " |" + board[63] + " | "
                           + board[64] + " | " + board[65]
                           + " |"+ board[66] + " | "
                           + board[67] + " | " + board[68]
                           + " |"+ board[69] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[70] + " | "
                           + board[71] + " | " + board[72]
                           + " |" + board[73] + " | "
                           + board[74] + " | " + board[75]
                           + " |"+ board[76] + " | "
                           + board[77] + " | " + board[78]
                           + " |"+ board[79] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[80] + " | "
                           + board[81] + " | " + board[82]
                           + " |" + board[83] + " | "
                           + board[84] + " | " + board[85]
                           + " |"+ board[86] + " | "
                           + board[87] + " | " + board[88]
                           + " |"+ board[89] + " | ");
        System.out.println("|----------------------------------------------|");
        System.out.println("| " + board[90] + " | "
                           + board[91] + " | " + board[92]
                           + " |" + board[93] + " | "
                           + board[94] + " | " + board[95]
                           + " |"+ board[96] + " | "
                           + board[97] + " | " + board[98]
                           + "|"+ board[99] + " |");
       System.out.println("|-----|---|---|---|---|---|---|---|---|---|----|");
    }
    static String Direction = " ";
      static void finalPosition(String move)
    {
                
        int l = move.length();
        int countUp = 0, countDown = 0;
        int countLeft = 0, countRight = 0;
         
        // traverse the instruction string
        // 'move'
        for (int i = 0; i < l; i++)
        {
            // for each movement increment
            // its respective counter
            if (move.charAt(i) == 'U')
            {
                countUp++;
            }
            else if (move.charAt(i) == 'D')
            {
                countDown++;
            }
            else if (move.charAt(i) == 'L')
            {
                countLeft++;
            }
 
            else if (move.charAt(i) == 'R')
            {
                countRight++;
            }
            if (move.charAt(i) == 'R')
            {
                countRight++;
            }
            
        }
        int a = Math.max(countRight,countLeft);
            int b = Math.max(countUp, countDown);
            if(countUp > countDown &&countUp > countLeft &&countUp > countRight )
            {
                Direction = "NORTH";
            }
            if(countDown > countUp &&countDown > countLeft && countDown > countRight )
            {
                Direction = "SOUTH";
            }
            if(countRight > countDown &&countRight > countLeft && countRight > countUp )
            {
                Direction = "WEST";
            }
            if(countLeft > countDown &&countLeft > countUp &&countLeft > countRight )
            {
                Direction = "EAST";
                
            }
        // calculates final position of robot
        System.out.println("Final Position: ("
                           + (countRight - countLeft) + ", "
                           + (countUp - countDown) + ", "+(Direction)+ ")");
       
    }
   
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        board = new String[100];
        
        Drone = "X";
        
        for(int a = 0; a<100; a++){
            board[a] = String.valueOf(a + 1);
            
        }
        System.out.println("Welcome to 10 x 10 Drone Toy.");
        printBoard();
        
        System.out.println("Enter P to Place the Drone");
            Scanner i = new Scanner(System.in);
           try{
               String str = i.nextLine();
            if((str.equals("P")|| str.equals("p")))
            {
                board[board.length-1] = Drone;
                printBoard();
                System.out.println("Initially the Drone was at:"+(board.length-1));
                System.out.println("Currently the Drone is at ");
        
        String move = "UDDLLRUUUDUURUDDUULLDRRRR";
        finalPosition(move);
       // printBoard();
          
            }
                
            }
            
           catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
            }  
            
        
        while (board!=null) {
            int numInput;
            
      // Exception handling.
           // numInput will take input from user like from 1 to 100.
           // If it is not in range from 1 to 100.
           // then it will show you an error "Invalid input."
            try {
                numInput = in.nextInt();
                if (!(board.length > 0 && board.length <= 99)) {
                    System.out.println(
                        "Invalid move re-enter your values: ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input re-enter your values: ");
                continue;
            }  
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = Drone;
 
                if (Drone.equals("X")) {
                    
                    printBoard();
                    System.out.println("The Drone is at:"+String.valueOf(numInput));
                    
                    
                }
                else {
                    System.out.println("Pease Place the Drone");
                }
            }
            
    }
        
        
    }
}
