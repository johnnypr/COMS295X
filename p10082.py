import sys


keyboard = {'1':'`','2':'1','3':'2',
'4':'3','5':'4','6':'5',
'7':'6','8':'7','9':'8',
'0':'9','-':'0','=':'-',
'W':'Q','E':'W','R':'E',
'T':'R','Y':'T','Y':'T',
'U':'Y','I':'U','O':'I',
'P':'O','[':'P',']':'[',
'\\':']','S':'A','D':'S',
'F':'D','G':'F','H':'G','J':'H',
'K':'J','L':'K',';':'L','\'':';',
'X':'Z','C':'X','V':'C','B':'V',
'N':'B','M':'N',',':'M','.':',',
<<<<<<< HEAD
'/':'.', ' ':' ','A':'\'','Q':'Q','A':'A','Z':'Z'}


def readLine():
    stdIn = sys.stdin.readline()
    if stdIn == '\n' or stdIn==' ':
        return None
    return list(stdIn.rstrip())



def decrypt(arr):
    message = ""
    for i in range(len(arr)):
        character = arr[i].capitalize()
        x = num_keyboard[character]
        message += x
    return message




if __name__ == "__main__":
    while True:
        usr = readLine()
        if usr == None:
            break
        answer = (decrypt(usr))
        print(answer)
=======
'/':'.', ' ':' ', '\n':'\n'}


for line in sys.stdin:
    print("".join(map(lambda z: keyboard[z], line[:-1])))
>>>>>>> ae51779db6db1dec4a06764eb92779ccd2e2a9f0
