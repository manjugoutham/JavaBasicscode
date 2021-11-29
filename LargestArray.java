package Bridgelabz;


public class LargestArray {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {2,5,12,10,15};  
        //Initialize max with first element of array.  
        int max = arr[0];    
        for (int i = 0; i < arr.length; i++)
        {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        
        System.out.println("Largest in given array: " + max);  
    }  
}
