package java;

import java.util.*;
import java.io.*;
    public class forked {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases--!=0){
            int knightPossx = s.nextInt();
            int knightPossy = s.nextInt();
            int kingPosx = s.nextInt();
            int kingPosy = s.nextInt();
            int queenPosx = s.nextInt();
            int queenPosy = s.nextInt();
            int count = 0;
            Boolean ran1 = false;
            Boolean run1 = true;
            Boolean ran2 = false;
            Boolean run2 = true;

            
            if(Math.abs(kingPosx-queenPosx) == 2*knightPossx){
                count++;
                ran1= true;
            }
            if(ran1 && Math.abs(kingPosx-queenPosx)/2 == knightPossy){
                run1 = false;
            }
            if(Math.abs(kingPosx-queenPosx) == 2*knightPossy && run1){
                count++;
            }
            if(Math.abs(kingPosy-queenPosy) == 2*knightPossx){
                count++;
                ran2 = true;
            }
            if(ran2 && Math.abs(kingPosy-queenPosy)/2 == knightPossx){
                run2 = false;
            }
            if(Math.abs(kingPosy-queenPosy) == 2*knightPossy && run2){
                count++;
            }
            if(Math.abs(kingPosy-queenPosy) == knightPossy+knightPossx && Math.abs(kingPosx-queenPosx) == knightPossy+knightPossx){
                count++;
            }
            System.out.println(count);
            
        }
    }
}
