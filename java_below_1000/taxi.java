package java;
import java.util.*;
import java.io.*;
public class taxi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> scrap = new ArrayList<>();
        int cars = 0;
        while(s.hasNext()){
            r.add(s.nextInt());
        }
        for(int o = 0; o<r.size();o++){
            if(scrap.contains(o)){o++;}
            for(int i = 0; i<r.size(); i++){
                if(scrap.contains(i)){i++;}
                if(o==i){
                    continue;
                }
                if(r.get(o)+r.get(i) == 4){
                    cars++;
                    if(o<i){
                        scrap.add(i);
                        scrap.add(o);
                    } else{
                        scrap.add(o-1);
                        scrap.add(i);
                    }
                    break;
                }
            }
        }
        cars+=r.size()-scrap.size();
        System.out.println(cars);
    }
}