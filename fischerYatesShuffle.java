class Solution {
    int[] array;
    int[] copy;

    Random rand=new Random();
    
    public Solution(int[] nums) {
        array=nums;
        copy=nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        copy=array.clone();
        return copy;
    }
    
    private void shuff(int i){
        int dex= i+rand.nextInt(copy.length-i);
        
        int temp=copy[i];
        copy[i]=copy[dex];
        copy[dex]=temp;
    }
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        for(int i=0; i<copy.length; i++){
            shuff(i);
        }
        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
