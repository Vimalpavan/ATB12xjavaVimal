import java.util.*;

public class EachCharacterOccurance
{
    public static void main(String[] args) {
        String str= "Hello";
                Map <Character,Integer>  map =new HashMap();
                char [] chars= str.toCharArray();
                for (char ch:chars) {
                    if (!map.containsKey(ch)) {
                        map.put(ch, 1);
                    }else {
                        int value =map.get(ch);
                        map.put(ch,value +1);

                    }
                }


        System.out.println("Each character occurance" + map);
    }
}
