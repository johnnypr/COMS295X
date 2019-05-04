import sys

output = "";

def main():
  while True:
    try:
      x = input()
      logic(x)
    except EOFError:
      x = '\n'
      logic(x)

def logic(stdIn):
  if stdIn == '\n':
    exit(0)
  global output
  output += stdIn

if __name__ == "__main__":
  main()
  print(output)