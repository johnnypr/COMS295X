import sys

def morph(words):
    for i in words:
        for j in range(len(i)):
            if i[j]==".": 
                i[j]=0
    return words

def replacement(words,row,column):
    grid_x=[1,0,0,-1,1,-1,1,-1]
    grid_y=[0,-1,1,0,-1,-1,1,1]
    
    for i in range(row):
        for j in range(column):
            if words[i][j]=="*":
                for k,z in zip(grid_y,grid_x):
                    if 0<=i+k and i+k<row and 0<=j+z and j+z<column  and words[i+k][j+z]!="*":
                        words[i+k][j+z]+=1
    return words
    
def main():
    rule=[1,1]
    count=1
    testcase=[int(x) for x in sys.stdin.readline().strip().split()]
    while rule!=[0,0]:
        container=[]
        for i in range(testcase[0]):
            container.append(list(sys.stdin.readline().strip()))
        store=morph(container)
        switcher=replacement(store,rule[0],rule[1])
        print("Field #{}:".format(count))
        
        for i in switcher:
            print("".join(map(str,i)))
        count+=1
        rule=[int(x) for x in sys.stdin.readline().strip().split()]
        if rule==[0,0]:
            break
        if rule!=[0,0]:
            print()
        
if __name__ == '__main__':
    main()