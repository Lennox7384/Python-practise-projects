# Bubble sort is a sorting algorithm that repeatedly compares two adjascent items are swaps them to be in desired order. 
# By the end of the first sort iteration using this algorithm, the largest or the smallest element  in the array (depending n the sort criterion) will be at the rightmost end of the array.


def bubbleSortAlg (array): # Create a function with a descriptive name for the type of sort algorithm, inthis case bubble sort.
                         #  Set the function to be able to take in a list as parameter.

    n= len(array)  # Find the number of elements in the array/list

    #Now loop through all elements in the array.

    for i in range (n): #Range(n) generates a sequence of numbers from 0 to "n" -1.
                                #Followed by  "n" x iterations, each of which i takes values from 0 to "n" -1.

        for j in range (0, n-i-1): # Reduces maximum possible iterations of j by 1 successively for each interation of i. 

            #Swapping at each [i j] occassion

            if array[j]> array[j+1]:
                array[j], array[j+1]= array[j+1], array[j] # Actual swapping happens here after mapping is done


#Quick testing

arr=[17,12,10,3,7,4,2,6]

bubbleSortAlg(arr)

print ("Sorted array is:")

for i in range (len(arr)):
    print ( arr[i])
    
