//Big O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] {i,j};
                }

            }
        }
        return null;
    }
}

//Big O(n) trading space 
//make sure and condition is met or else we wont be able to 
class BetterSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i) {
                return new int [] {i, map.get(target-nums[i])};
            }
        }
        return null;
    }
}

//single pass
class SingleLoopSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int [] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
    
        return null;
    }
}

//2pointer solution sort and move the pointers. o nlogn
class 2pointerSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        int left=0, right=nums.length-1;
        while(left<right){
            int sum=temp[right]+temp[left];
            if(sum>target) right--;
            else if(sum<target)left++;
            else break;
        }
        int leftElement= temp[left], rightElement=temp[right];
        int result[] = new int[2];
        boolean isChecked = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==leftElement && !isChecked)
             {result[0]=i; isChecked=true;}
            else if(nums[i]==rightElement) result[1]=i;  
        }
        return result;
    }
}


