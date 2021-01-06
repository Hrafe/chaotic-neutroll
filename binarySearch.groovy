
def bSearch(int[] A, int low, int high, int x) {

    if (low > high) {

        return -1
    }

    int mid = (low + high)/2

    if (x == A[mid]) {

        return mid
    
    } else if ( x < A[mid]) {
        
        return bSearch(A, low, mid - 1, x)
    
    } else {
    
        return bSearch (A, mid + 1, high, x)
    }
}

int[] A = [ 2, 5, 6, 8, 9, 10 ]

int key = 9
int low = 0
int high = A.size() - 1

int index = bSearch(A, low, high, key)

if (index != -1 ) {

    println "Value [$key] found at index [$index]"

} else {

    println "Value not found in the array"
}
