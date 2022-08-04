//Sorting Algorithms
import java.util.Arrays;
import java.util.Scanner;


public class Sorting{


    // BUBBLE SORT using iterative method
        /* Here we compare the adjacent elemet of array ie arr[i]>arr[i+1]
         * if arr[i]>arr[i+1] then swap and increment i by 1 and then proceed till last element 
         * else increment by 1
         *  time complexity calculation : for coloumn N-1 times the operation is performed
         *  time complexity calcularion : for rows N-1 times the operation is performed
         *  Therefore worst time complexity:(N-1)(N-1)
         *  Asympotic time complexity will be O(n^2) 
         */
        public static void BubbleSort(int [] arr){
            int temp =0;
            for(int i =0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }
        // Insertion sorting 
         // insertion sort flow--------------------------------------------
            /* Array is firsly Divided into two parts Sorted and Unsorted
             * sorted part will contain only one element which ie probably the first element 
             * then we will compare the sorted arr with the unsorted arrays element 
             */

        public static void InsertionSort(int arr[]){
            int n = arr.length;
           
            for(int i = 1; i<n; i++){
                int value = arr[i];
                int j = i-1;

                while(j>=0 && arr[j]> value){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]= value;
            }
        }
        // Minimun of array
        public static int min(int arr[]){
            int min = arr[0];
            for(int i = 0; i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];

                }
            }
            return min;
        }


        // Selection sorting 
        /* Here we create a sorted and a unsorted array. the sorted array is most problably is the first element of array
         * The  concepts of Selection sort is derived from Selection of min(in ascending) and swaping with the 
         * element the key value.
        */
        public void SelectionSort(int arr[]){
             
            for(int i =0; i<arr.length; i++){
                int min_idx = i;
                for(int j=1+i;j<arr.length;j++){
                  if(arr[j] < arr[min_idx])
                  min_idx = j;
                }

                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

    public static void main(String[] args) {
        
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        Sorting sorted = new Sorting();
        // sorted.BubbleSort(arr);
        // sorted.InsertionSort(arr);
        sorted.SelectionSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(sorted.min(arr));

        sc.close();

    }
}