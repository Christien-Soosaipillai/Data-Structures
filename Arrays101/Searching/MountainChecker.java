import java.util.*;

class MountainChecker{
    public static void main(String[] args){
        int[] nums1 = new int[]{2,1};
        int[] nums2 = new int[]{3,5,5};
        int[] nums3 = new int[]{0,3,2,1};
        System.out.println("Is the following array a mountain "+ Arrays.toString(nums1)+ ": " + validMountainArray(nums1));     
        System.out.println("Is the following array a mountain "+ Arrays.toString(nums2)+ ": " + validMountainArray(nums2)); 
        System.out.println("Is the following array a mountain "+ Arrays.toString(nums3)+ ": " + validMountainArray(nums3)); 

    }


    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        
        int last = 0;
        int direction = 0;                                      //1 = going up mountain , 2 = going down mountain
        for(int i = 0; i < arr.length; i++){
            if(direction == 0 || direction == 1){               //if we are at beginning or on the way up
                if(last < arr[i] ||i == 0){                     
                    last = arr[i];
                    if(i==1){                                   //if we get to index 1 means we are starting to go up
                        direction = 1;
                    }
                }else if(last > arr[i] && direction == 1){      //we hit the peak now we are going down the mountain    
                    last = arr[i];
                    direction = 2;                              //change direction to go down the mountain
                }else{
                    return false;                               
                }
            }else{
                if(last > arr[i]){                              
                    last = arr[i];
                }else{
                    return false;
                }
            }
        }
        if(direction == 2){                                     //Passed all conditions in for loop and made it down mountain
            return true;                                    
        }else{                                                  //direction is only 1 meaning increasing array only
            return false;
        }
        
    }
}    