import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        int ch2 = in.nextInt();
        int del = 2;
        int del1 = 2;
        int sum =0;
        while((ch>1) && (ch2 >1)){
            if ((ch % del == 0)) {
               if ((!((list.contains(del))&&(list.contains(del1))))){
                list.add(del);}
                ch/= del;
               sum+=del;
            }
            else del ++;
               if (ch2 % del1 == 0) {
                if (!((list.contains(del))&&(list.contains(del1)))){
                    list.add(del);}
                ch2/= del1;
                sum+=del;
            }
            else
                del1++;
        }
        list.add(0,1);
        sum++;
        Collections.sort(list);
        System.out.println(list);
        System.out.println(sum);
    }
}
