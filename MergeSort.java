import java.util.Scanner;
import java.util.Arrays;
// Task to Sort an array 
// Space Complexity:O(n)
//Time Complexity: O(nlogn): n- for conquer && logn for Divide:

// why merge  sort better time_complexity 
public class MergeSort {
    // divide the array into sub array untill size of sub array becomes 1.
    public static void divide(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        // Divide left most sub array
        divide(arr, si, mid);
        // Divide Right most array
        divide(arr,mid+1, ei);
        //Merge the divided array into the sorted array;
        MergeS(arr,si,mid,ei);

    }
    //  combine the divided array into the sorted array 

        public static void MergeS(int arr[],int si, int mid, int ei){
            // lets create a temporary array where we will store the value origianl array temporarly
            int temp[] = new int [ei-si+1];
            int idx1 = si;
            int idx2 = mid+1;
            
            int x =0;

            while(idx1<=mid && idx2<=ei){   // two subarrays are compared and stored in temporary arr
                if(arr[idx1]<=arr[idx2]){
                    temp[x++] = arr[idx1++];
                }
                else{
                    temp[x++]=arr[idx2++];
                }
            }
            while(idx1<=mid){  // copying the remaining element in the temp array
                temp[x++]= arr[idx1++];
            }
            while(idx2<=ei){    // copying the remaining element in the temp array
                temp[x++] = arr[idx2++];
            }
            for(int i=0,j=si;i<temp.length;i++,j++)// copying the remaining element in the temp array+,j++){// copying to original array
                arr[j] = temp[i];
            }
            
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

    }

}
