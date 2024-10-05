import java.util.Arrays;
import java.util.Collections;

public class SortingWithJava{

        public static void main(String [] args)  //Main method setup.
        {
            // Implementation of bubble sort with loops

             int arr []= {37,26,24,77,29, 67, 8,1,0,41};

            
            // Quick copy of above integer array. We'll need it later
            int copiedArr [] = new int [arr.length];
            System.arraycopy(arr, 0, copiedArr, 0, arr.length);

            //Declare and Initialise a new array in wrapper class.
            Integer arr2 []= new Integer[]{32,56,39,29,59,94,93,72,24,84,65};


            //Loop Implementation
            for (int i=0;i<arr.length;i++)
            {
                
                for(int ii=i+1;ii<arr.length;ii++) // Notice inner loop points to 1 index ahead of the outer loop. 
                {
                    
                    //Swapping 
                    int temporaryHold=0;
                    if(arr[ii]<arr[i])
                    {
                        temporaryHold=arr[i];
                        arr[i]= arr[ii];
                        arr[ii]=temporaryHold;
                    }

                } 
            }

            System.out.printf("Sorted by for actual looping : %s", Arrays.toString(arr));

            // -----------------------------------------------------------------
            //Now lets do the same sort.
            //and other library components like the sort() method of Aray class. 
            //------------------------------------------------------------------

            System.out.println("\n");

            Arrays.sort(copiedArr);
            System.out.printf("Sorted by sort () Method only: %s", Arrays.toString(copiedArr));

            for(int i=0;i<copiedArr.length;i++)
            {
                
            }
            
            //-----------------------------------------------------------------
            // Now, we'll use collections utility class 
            // And the sort method to perform the same sort.
            //-----------------------------------------------------------------

            System.out.println("\n");

            Arrays.sort(arr2,Collections.reverseOrder());
            System.out.printf("Collections and Array class components involved: %s", Arrays.toString(arr2));
            System.out.println("\n");

        }

}



