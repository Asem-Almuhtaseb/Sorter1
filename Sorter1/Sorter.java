public class Sorter {

    public static void insertionSort(int numArray[]){
        for(int k=1; k<numArray.length-1; k++)   {
            int temp = numArray[k];
            int j= k-1;
            while(j>=0 && temp <= numArray[j])   {
                numArray[j+1] = numArray[j];
                j = j-1;
            }
            numArray[j+1] = temp;
        }
    }

    public static void sort(array){
        insertionSort(array);
            }
    public static void main(String[] args) {}
    
}
