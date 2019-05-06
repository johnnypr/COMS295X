import sys


pancakes= []
stack =[]


def main():
 while True:
    line = input()
    if line == '':
        break
    
    for c in list(line):
        pancakes.append(c)
    
    while (isSorted() != -1):
       pushStack()
       flip()

   
       


def isSorted():
    global pancakes
    counter = 0;
    for i in range(len(pancakes)-1):
        if pancakes[i] < pancakes[i+1]:
            counter += 1;
        else:
            return i;
    if i == len(pancakes) -2:
        return -1

def pushStack():
    global pancakes
    if isSorted() == 0:
        for i in range(len(pancakes)):
            stack.append(pancakes[i])
    else:
        for i in range(isSorted(pancakes), 0):
            stack.append(pancakes[i])
        return stack
        
            
def flip():
    global pancakes
    global stack
    j = len(stack)-1
    for i in range(len(stack)):
        pancakes[i] = stack[j]

        j-=1;
    
        
    stack = []
      

   
    
    




# def sortLoop(arr):
#   for i in range(len(arr)-1):
      

if __name__ == '__main__':
    main()