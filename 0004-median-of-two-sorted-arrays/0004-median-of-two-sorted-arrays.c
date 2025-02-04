double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {

    int arr[nums1Size+nums2Size];
    int n = 0;
    
    for(int i = 0; i<nums1Size+nums2Size; i++){

        if(i<nums1Size){

            arr[i]=nums1[i];
        }
        else{
            arr[i]=nums2[n++];
        }
    }

    for(int i = 0; i<nums1Size+nums2Size;i++){
        for(int j = i+1; j<nums1Size+nums2Size; j++){

            if(arr[i]>arr[j]){
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
    }

    if ((nums1Size+nums2Size) %2 ==0){
            int l = (nums1Size+nums2Size) /2;
            return (arr[l]+arr[l-1])/2.00;
        }
    else {
            return arr[(nums1Size+nums2Size)/2];
        }

    
    return (double)(arr[(nums2Size+nums2Size)/2]);
}