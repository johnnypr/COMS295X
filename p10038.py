import sys


def main():
  for line in sys.stdin:
    input = line.split()
    if not input:
      break
    n = int(input[0])
    sequence = input[1:]
    sequence = list(map(int,sequence))
  return checkJolly(n,sequence)


def checkJolly(n,sequence):
  set = []
  diff = 0
  4
  for i in range(n-1):
    set.append(i+1)

  if not set:
    return "Jolly"
  
  for index in range(n): 
    diff = abs(sequence[index]-sequence[index+1])
    if (diff in set):
      set.remove(diff)
      if not set:
        return "Jolly"
    else:
      return "Not Jolly"
 
      

if __name__ == '__main__':
  print(main())
    