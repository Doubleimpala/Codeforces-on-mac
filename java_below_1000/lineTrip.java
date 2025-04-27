package java;
import java.util.*;
import java.io.*;
public class lineTrip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase--!=0){
            int n = s.nextInt();
            int x = s.nextInt();
            if(n<1){
                System.out.println(x*2);
                return;
            }
            
            int[] stations = new int[n];
            int maxGap = 0;
            
            for(int i = 0; i<n;i++){
                stations[i] = s.nextInt();
            }
            if(stations[0]<(x-stations[n-1])*2){
                maxGap = (x-stations[n-1])*2;
            } else if (stations[0]==(x-stations[n-1])*2){
                maxGap = (x-stations[n-1])*2;
            } else {
                maxGap = stations[0];
            }
            
            for(int f = 0; f<n-1;f++){
                if(maxGap<stations[f+1]-stations[f]){
                    maxGap=stations[f+1]-stations[f];
                }
            }
            System.out.println(maxGap);
    }
}
}