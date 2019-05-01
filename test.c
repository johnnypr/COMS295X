#include <stdio.h>

int main()
{
	int n;
    int costs[1010];
    long total ;

    long positive_Diff;
    long negative_Diff;

    int whole;
    int decimal;
    int i;

    long lowAverage;
    long highAverage;
    
    long diff;

	while(1)
	{
        //Grabs number of people
		scanf("%d", &n);
        // to end the stdIN
		if (n == 0)
			break;

		total = 0;

		for(i=0; i<n; i++)
		{

            //Use to calculate to the nearest cent
			scanf("%d.%d", &whole, &decimal);
			costs[i] = whole * 100 + decimal;

			total = total + costs[i];
		}

		lowAverage = total / n;

    // This is where we calculate difference and assign
    // remainders to the ones that gave more money
		if(total % n != 0)
			highAverage = lowAverage + 1;
		else
			highAverage = lowAverage;

		positive_Diff = 0;
		negative_Diff = 0;

		for(i=0; i<n; i++)
		{
			if(costs[i] > highAverage)
				positive_Diff = positive_Diff + (costs[i] - highAverage);
			else if (costs[i] < lowAverage)
				negative_Diff = negative_Diff + (lowAverage - costs[i]);
		}

        //prints out different formated with  a dollar sign
		diff = positive_Diff > negative_Diff ? positive_Diff : negative_Diff;

		printf("$%.2lf\n", diff/100.0);

	}
	return 0;
}