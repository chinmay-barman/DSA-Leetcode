class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        ans = []
        for i in range(0,len(nums)-2):
            left = i+1
            right = len(nums)-1
            if(i>0 and nums[i]==nums[i-1]):
                continue
            while(left<right):
                sum = nums[i]+nums[left]+nums[right]
                if sum==0:
                    arr = []
                    arr.append(nums[i])
                    arr.append(nums[left])
                    arr.append(nums[right])
                    ans.append(arr)
                    left+=1
                    right-=1
                    while(left<right and nums[left]==nums[left-1]):
                        left+=1
                    while(left<right and nums[right]==nums[right+1]):
                        right-=1
                elif sum>0:
                    right-=1
                else:
                    left+=1
        return ans                    
