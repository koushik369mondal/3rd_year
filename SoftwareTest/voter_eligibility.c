/* voter_eligibility.c
   Compile: gcc voter_eligibility.c -o voter_eligibility
*/
#include <stdio.h>

int main(void)
{
    int age;
    printf("Enter age: ");
    if (scanf("%d", &age) != 1)
    {
        printf("Input error.\n");
        return 1;
    }

    if (age < 0 || age > 120)
    {
        printf("Invalid age. Please enter age between 0 and 120.\n");
    }
    else if (age >= 18)
    {
        printf("Age %d: Eligible to vote.\n", age);
    }
    else
    {
        printf("Age %d: Not eligible to vote.\n", age);
    }

    return 0;
}
