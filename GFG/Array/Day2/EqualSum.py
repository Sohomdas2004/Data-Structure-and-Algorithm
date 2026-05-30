class Solution:
	def equilibrium(self, arr):
		# code here
		summ = 0

		for num in arr:
			summ += num

		leftSum = 0

		for num in arr:
			summ -= num
			if summ == leftSum:
				return "true"
			leftSum += num

		return "false"