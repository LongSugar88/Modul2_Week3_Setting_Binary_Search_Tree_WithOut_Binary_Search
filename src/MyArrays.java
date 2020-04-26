public class MyArrays {
    static boolean search(int[] list, int number){
        int start = 0;
        int stop = list.length-1;
        while ( stop >= start){
            int middle = (start + stop)/2;
            if(number == list[middle]){
                return true;
            } else if(number > list[middle]){
                start = middle+1;
            } else {
                stop = middle-1;
            }
        }
        return false;
    }
}
