import java.util.*; 

public class Sort{

    public static void main(String[] args){
        String[] array= {"a","f","c","d","e","b"};
        ArrayList<String> haystack=new ArrayList<String>(Arrays.asList(array)); 
        System.out.println(haystack);  
        System.out.println("Selection sort for array is:");
        selectionSort(haystack);  
        System.out.println(haystack); 
        String[] array2= {"a","f","d","c","e","b"};
        ArrayList<String> haystack2=new ArrayList<String>(Arrays.asList(array2)); 
        System.out.println(haystack2);  
        System.out.println("Insertion sort for array is:");
        selectionSort(haystack2);  
        System.out.println(haystack2);
        String[] array3= {"a","f","d","c","e","b"};
        ArrayList<String> haystack3=new ArrayList<String>(Arrays.asList(array3)); 
        System.out.println(haystack3);  
        System.out.println("Bubble sort for array is:");
        selectionSort(haystack3);  
        System.out.println(haystack3);  
       
        
      
    }

static void selectionSort(ArrayList<String> list){
for(int i=0; i<list.size(); i++){
    int k=i; 
    for(int j=i+1; j<list.size(); j++){
        if(list.get(j).compareTo(list.get(k))<0){
            k=j; 
        }
    }
    String buffer =list.get(i); 
    list.set(i, list.get(k)); 
    list.set(k, buffer); 
}
}

void insertionSort(ArrayList<String> list){
    for (int i=1; i<list.size(); i++){
        for (int k=i; k>1 && list.get(k).compareTo(list.get(k-1))<1; k--){
            String buffer =list.get(k); 
            list.set(k, list.get(k-1)); 
            list.set(k-1, buffer); 
        }
    }

}

static void bubbleSort(ArrayList<String> list){
for(int i=0; i<list.size(); i++){
    boolean swapped=false; 
    for(int j=list.size()-1;j>=i;j--){
        if(list.get(j).equals(list.get(j-1))){
            String buffer=list.get(j); 
            list.set(j, list.get(j-1));
            list.set(j, buffer); 
        }
    }
    if(!swapped) break; 
}
}





}