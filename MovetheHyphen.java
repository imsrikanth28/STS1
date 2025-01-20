//Move the Hyphen

import java.io.*;
import java.util.*;

public class Solution {

    public static String Hyp(String str)
    {
        StringBuilder hp=new StringBuilder();
        StringBuilder op=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='-'){ hp.append(ch); }
            else{ op.append(ch); }
        }
        return hp.toString()+op.toString();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Hyp(s));
    }
}
