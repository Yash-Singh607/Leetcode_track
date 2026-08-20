class Solution { 
    public int[] resultArray(int[] nums) { 
        int n = nums.length; 
        // create two arrays to store the elements
        int[] arr1 = new int[n]; 
        int[] arr2 = new int[n]; 
        int a = 0; 
        int b = 0; 
        // put the first element in arr1 and second in arr2
        arr1[a] = nums[0]; 
        arr2[b] = nums[1]; 
        a++; 
        b++; 
        // start from the third element and compare last elements
        for (int i = 2; i < n; i++) { 
            // if last element of arr1 is greater, add current element to arr1
            if (arr1[a - 1] > arr2[b - 1]) { 
                arr1[a] = nums[i]; 
                a++; 
            } else { 
                // otherwise add current element to arr2
                arr2[b] = nums[i]; 
                b++; 
            } 
        } 
        // combine arr1 and arr2 into the result array
        int[] result = new int[n]; 
        int k = 0; 
        // first copy all elements of arr1
        for (int i = 0; i < a; i++) { 
            result[k] = arr1[i]; 
            k++; 
        } 
        // then copy all elements of arr2
        for (int j = 0; j < b; j++) { 
            result[k] = arr2[j]; 
            k++; 
        } 
        return result; 
    } 
}