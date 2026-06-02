class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        map={}
        n=len(nums)//2

        for num in nums:
            if num in map:
                map[num]=map[num]+1
            else:
                map[num]=1

        for num in map:
            if map[num]>n:
                return num
            
        return -1