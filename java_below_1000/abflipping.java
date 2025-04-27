package java;
import java.util.*;
import java.io.*;
public class abflipping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        char placeholder;
        int swapcounter = 0;
        int before = 0;
        int after = 0;
        Boolean done = false;
        
        
        while(testcases--!=0){
            done = false;
            swapcounter =0;
            int n = s.nextInt();
            char[] word = new char[n];
            ArrayList<Integer> takenindex = new ArrayList<Integer>();
            String st = s.next();
            for(int i = 0; i<st.length(); i++){
                word[i] = st.charAt(i);
            }
            while(done == false){
                before = swapcounter;
                for(int z = 0; z<st.length()-1; z++){
                    if(word[z]=='A'&&word[z+1]=='B'&&!takenindex.contains(z)){
                        takenindex.add(z);
                        placeholder = word[z];
                        word[z] = word[z+1];
                        word[z+1] = placeholder;
                        swapcounter++;
                    }
                }
                after = swapcounter;
                if(before == after){
                    break;
                }
            }
            System.out.println(swapcounter);
            
        }
    }
}

