import sys
# Must keep track of relatives and street numbers

def calcDistance(relatives, arrNumStreet):
    # sort the array for convinience
		arrNumStreet.sort()
        # initialize distance
		distance = 0

        # even or odd
		if relatives%2:
			m = arrNumStreet[relatives//2]
		else:
			m = ((arrNumStreet[relatives//2 - 1] + arrNumStreet[relatives//2])/2)

            # final calculation minimal distance
		for a in arrNumStreet:
			distance += abs(a - m)

		return int(distance)


# main used to grab std input
if __name__ == '__main__':
	stdIn = int(input())
	for _ in range(stdIn):
		arr = list(map(int, input().split()))
		print(calcDistance(arr[0], arr[1:]))