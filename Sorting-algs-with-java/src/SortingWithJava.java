public class SortingWithJava{

        public static void main(String [] args)
        {
            // First we are going to implement bubble sort with loops

            //Create an array of integers targeted

            int arr []= {37,26,24,77,29, 67, 8,1,0,41};

            //Now implement the loops such that swapping occurs and numbers rearranged

            for (int i=0;i<arr.length;i++)
            {
                // Notice that this inner loop points to an index ahead of the ouiter loop. 
                for(int ii=i+1;ii<arr.length;ii++) 
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

                //Now print every elemtn of the sorted Array

                System.out.println(arr[i]+" ");
            }

        }

}



