import java.util.*; 

public class Search{

    public static void main(String[] args){
        String[] array= {"a","b","c","d","e","f"};
        ArrayList<String> haystack=new ArrayList<String>(Arrays.asList(array));  
        System.out.println("Search for a is:"+search(haystack, "a")); 
        System.out.println("Binary Search for a is:"+binarySearch(haystack, "a")); 
      
      
    }

    static int search(ArrayList<String> haystack, String needle){

        for(int i=0; i<haystack.size(); i++){
            if(haystack.get(i).equals(needle)){
                return i; 
            }
        }
        return -1; 
    }

    static int binarySearch(ArrayList<String> haystack, String needle){
        int high=haystack.size()-1; 
        int low=0; 

        while(high>=low){
           int mid=(high+low)/2; 
            int comp= haystack.get(mid).compareTo(needle); 
            if(comp==0){
                return mid; 
            }else if(comp>0){
               // needle<list[mid]; 
               high =mid-1; 
            }else{
                low=mid+1; 
            }
        }
        return -1; 
    }

    
}