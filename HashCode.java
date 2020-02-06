import java.util.Vector; 
  
public class HashCode 
{ 
  
      
    static int deno[] = {2,5,6,8}; 
    static int n = deno.length; 
  
  public static void findMin(int V) 
    { 
        // Initialize result  
        Vector<Integer> ans = new Vector<>(); 
  
        // Traverse through all slices 
        for (int i = n - 1; i >= 0; i--) 
        { 
            // Find denominations  
            while (V >= deno[i])  
            { 
                V -= deno[i]; 
                ans.add(deno[i]); 
            } 
        } 
  
        // Print result  
        for (int i = 0; i < ans.size(); i++) 
        { 
            System.out.print(" " + ans.elementAt(i)); 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        int n = 17; 
        System.out.print("Answer" + n + ": "); 
        findMin(n); 
  
    } 
}