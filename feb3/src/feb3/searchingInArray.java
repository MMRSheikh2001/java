package feb3;

/**
 *
 * @author Admin
 */
public class searchingInArray {

    public static void main(String[] args) {
        int numbers[]={12,34,34,232,23,43,54};
        int search = 232;
        int indexNo= linearSearch(numbers, search);
        System.out.println(indexNo);
        
    }
    public static int linearSearch(int[] array,int searchNumber){
        
        for(int index =0;index<array.length;index++){
        if(array[index]== searchNumber){
        return index;
        
        }
        }
    return -1;
    }

}
