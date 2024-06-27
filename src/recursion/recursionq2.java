package recursion;
import java.util.*;

public class recursionq2 {

    public static void print(String k,String l,ArrayList<String> list){
            if(k.length()==0){
                list.add(l);
                return;
            }
            print(k.substring(1),l,list);
            print(k.substring(1),l+k.charAt(0),list);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String k=sc.next();
            ArrayList<String>list=new ArrayList<>();
            print(k,"",list);
            Collections.sort(list);
            for(String num:list){
                System.out.print(num+" ");
            }
        }
    }

