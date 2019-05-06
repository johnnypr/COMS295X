import sys


stack=[]
n = 0
pancakes= []


def main():
 while True:
    line = input()
    if line == '':
        break
    pancakes = line
    if isSorted(pancakes) == -1:
        return
    else:
        while(isSorted(pancakes) != -1):
            pushStack(pancakes)


def isSorted(arr):
    counter = 0;
    for i in range(len(arr)-1):
        if arr[i] < arr[i+1]:
            counter += 1;
        else:
            return i;
    if i == len(arr) -2:
        return -1

def pushStack(arr):
    if isSorted(arr) == 0:
        for i in range(len(arr)-1):
            stack.append(arr[i])
    else:
        for i in range(isSorted(arr), 0):
            




# def sortLoop(arr):
#   for i in range(len(arr)-1):
      

if __name__ == '__main__':
    main()