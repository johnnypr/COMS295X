import sys

while True:
	n = int(sys.stdin.readline())

	if n == 0:
		break


	total = 0
	cost = []
	
	for i in range(n):
		x = (float(sys.stdin.readline()))
		cost.append(x)
		average = average + x

	average = average/n
		
	negative_Diff=0
	positive_Diff=0
	
	for i in range (n):
		v = int((cost[i]-average)*100)

		if v > 0:
			positive_Diff = float(positive_Diff + v)
		else:
			negative_Diff = float(negative_Diff + v)
	negative_Diff -= negative_Diff;


	if (positive_Diff<negative_Diff):
		diff = positive_Diff
	else:
		diff = negative_Diff
	print("$%.2f"%(diff))