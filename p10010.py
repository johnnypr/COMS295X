import sys

# def forward():


# def reverse():


# def vertical():


# def incline():



# def decline():

# def findWord(grid,words,rows,columns):
#     for index in range(len(words)):
#         for r in range(row):
#             for c in range(column):
#                 if (grid[r][c] == words[index][0]):
#                     print(r + " and " + c)
                    
                



def readLine():
    stdIn = sys.stdin.readline()
    if stdIn=='':
        return None
    elif stdIn != '\n':
        stdIn = list(map(str,stdIn.rstrip().split())
    return stdIn


if __name__ == '__main__':
    while True:
        data = readLine()
        # rows = int(data[1])
        # columns =int(data[2])

        # index = 0
        # for x in range(rows):
        #     for y in range(columns):
        #         grid[x][y] = data[index].lower()
        #         index += 1
        
        # n = int(data[index+1])
        # words = []
        # for word in range(n):
        #     words[word] = data[index + 1]
        #     index += 1

        # print(grid)
        
        # if data is None:
        #     break
        
