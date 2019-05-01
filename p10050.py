
# Grabs User Input
testcases = int(input())

for i in range(testcases):
    # N and P
    numDays = int(input())
    parties = int(input())

    arrHartals = []

    for j in range(parties):
        arrHartals.append(int(input()))

    # Initialize an Array to get the weeks 
    weekdays = []

    for j in range(1, numDays + 1):
        holiday = False

        if not (j % 7 == 6 or j % 7 == 0):
            for x in range(len(arrHartals)):
                #Checks if its not a holiday 
                if j % arrHartals[x] == 0:
                    holiday = True
                    break

        weekdays.append(holiday)



    print(weekdays.count(True))