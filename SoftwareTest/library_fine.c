/* library_fine.c
   Compile: gcc library_fine.c -o library_fine
*/
#include <stdio.h>

int main(void)
{
    long days;
    long fine = 0;
    printf("Enter number of late days: ");
    if (scanf("%ld", &days) != 1)
    {
        printf("Input error.\n");
        return 1;
    }

    if (days < 0)
    {
        printf("Invalid input. Number of late days cannot be negative.\n");
        return 0;
    }

    if (days == 0)
    {
        fine = 0;
    }
    else
    {
        /* slab calculation */
        long d = days;
        if (d <= 5)
        {
            fine = d * 1;
        }
        else if (d <= 10)
        {
            fine = 5 * 1 + (d - 5) * 2;
        }
        else
        {
            fine = 5 * 1 + 5 * 2 + (d - 10) * 5;
        }
    }

    printf("Late days: %ld\nTotal fine: %ld\n", days, fine);
    return 0;
}
