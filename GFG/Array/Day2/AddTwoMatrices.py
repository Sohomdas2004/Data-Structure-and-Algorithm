class Solution:
	def Addition(self, matrixA, matrixB):
		# Code here
		for i in range(len(matrixA)):
		    for j in range(len(matrixA[0])):
		        matrixA[i][j]+=matrixB[i][j]