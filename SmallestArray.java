package Bridgelabz;

public class SmallestArray {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {12,5,10,6,8};  
        //Initialize max with first element of array.  
        int min = arr[0];    
        for (int i = 0; i < arr.length; i++)
        {  
             
           if(arr[i] < min)  
               min = arr[i];  
        }  
        
        System.out.println("Smallest in given array: " + min);  
    }  
}