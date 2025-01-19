//Linked List Adding Even after Odd Node

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        int input;
        while((input=sc.nextInt())!=-1)
        {
            list.add(input);
        }
        LinkedList<Integer> odd=new LinkedList<>();
        LinkedList<Integer> even=new LinkedList<>();
        for(int num: list)
        {
            if(num%2==0)
            {
                even.add(num);
            }
            else
            {
                odd.add(num);
            }
        }
        odd.addAll(even);
        for(int i:odd)
        {
            System.out.print(i+" ");
        }
        
    }
}
