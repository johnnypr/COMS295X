import sys


def repsuffix_grammar(string):
    arrWords = []
    words = string.split()

    for words in words:
        try:
            nr = int(words)
        except ValueError:
            arrWords.append(words)

    s = str(arrWords[0])
    t = str(arrWords[1])

    def wordTransform(s, i):
        if s != t:
            if s == str(arrWords[2]):
                s = str(arrWords[3])
                i += 1
                return wordTransform(s, (i))
            elif s == str(arrWords[4]):
                s = str(arrWords[5])
                i += 1
                return wordTransform(s, (i))
            elif s == str(arrWords[6]):
                s = str(arrWords[7])
                i += 1
                return wordTransform(s, (i))
            elif s == str(arrWords[8]):
                s = str(arrWords[9])
                i += 1
                return wordTransform(s, (i))
            else:
                return " Case 1: No Solution "
        elif s == t:
            return " Case 1: " + str(i)

    return wordTransform(s, 0)


print repsuffix_grammar("AA BB 4 A B AB BA AA CC CC BB")
