
program bubble_sort
    implicit none 
    integer :: arr (10) = [34,12,25,8,37,55,2,72,14,68]
    integer :: i,j,temporary
    integer :: n


    !Set n to the size of the array
    n=size(arr)

    !perform bubble 

        do i =1, n-1
            do j=1,n-i
                if (arr(j)>arr(j+1))then
                !Swap
                temporary=arr(j)
                arr(j)=arr(j+1)
                arr(j+1)=temporary
                end if
            end do
        end do

    !output the sorted Array
    print*, "Sorted Array:"
        do i =1, n
        print *, arr (i)
        end do
end program bubble_sort