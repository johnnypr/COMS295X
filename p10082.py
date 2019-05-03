import sys


num_keyboard = {'1':'`','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6','8':'7','9':'8','0':'9','-':'0','=':'-'}
top_keyboard = {'W':'Q','E':'W','R':'E','T':'R','Y':'T','Y':'T','U':'Y','I':'U','O':'I','P':'O','[':'P',']':'[','\\':']'}
mid_keyboard = {'S':'A','D':'S','F':'D','G':'F','H':'G','J':'H','K':'J','L':'K',';':'L','\'':';'}
bottom_keyboard =  {'X':'Z','C':'X','V':'C','B':'V','N':'B','M':'N',',':'M','.':',','/':'.', ' ':' '}


def readLine():
    stdIn = sys.stdin.readline()
    if stdIn == '\n' or stdIn==' ':
        return None
    return list(stdIn.rstrip())



def decrypt(arr):
    
    message = ""
    for i in range(len(arr)):
        while True:
            if (arr[i] in num_keyboard):
                x = num_keyboard[arr[i]]
                break
            elif (arr[i] in top_keyboard):
                x = top_keyboard[arr[i]]
                break
            elif (arr[i] in mid_keyboard):
                x = mid_keyboard[arr[i]]
                break
            elif (arr[i] in bottom_keyboard):
                x = bottom_keyboard[arr[i]] 
                break  
        message += x
    return message




if __name__ == "__main__":
    while True:
        usr = readLine()
        if usr == None:
            break
        print(decrypt(usr))