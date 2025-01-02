import java.util.*;
public class pangram {
    public boolean isPangram(String s) {
    Set<Character>set=new HashSet<>();
        for(int i=0;i<26;i++){

        set.add((char)(i+97));
    }
    s=s.toLowerCase();
        for(char ch:s.toCharArray()){
        if(set.contains(ch)){
            set.remove(ch);

        }
    }
       if(set.isEmpty()){
        return true;
    }
       else{
        return false;
    }

}}
