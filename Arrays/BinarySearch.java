package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int target = 1;
        int low = 0;
        int high = array.length -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            int guess = array[mid];
            if(guess == target){
                System.out.println("the element is at "+mid);
                break;
            }
            else{
                if(guess>target){
                    high=mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }

    }
}
