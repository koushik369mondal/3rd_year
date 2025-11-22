/* atm_pin_verifier.c
   Compile: gcc atm_pin_verifier.c -o atm_pin_verifier
*/
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int is_valid_pin_format(const char *pin)
{
    if (strlen(pin) != 4)
        return 0;
    for (int i = 0; i < 4; ++i)
        if (!isdigit((unsigned char)pin[i]))
            return 0;
    return 1;
}

int main(void)
{
    const char correct_pin[] = "2580"; /* change to desired correct PIN */
    char pin[100];
    int attempts = 0;
    int max_attempts = 3;

    while (attempts < max_attempts)
    {
        printf("Enter 4-digit PIN: ");
        if (scanf("%99s", pin) != 1)
        {
            printf("Input error.\n");
            return 1;
        }

        if (!is_valid_pin_format(pin))
        {
            printf("Invalid PIN format. PIN must be exactly 4 digits.\n");
            /* Do not count invalid-format attempt against limit?
               We'll count it as a failed attempt (common behaviour). */
            attempts++;
            if (attempts < max_attempts)
                printf("Incorrect PIN. Attempts left: %d\n", max_attempts - attempts);
            continue;
        }

        if (strcmp(pin, correct_pin) == 0)
        {
            printf("Correct PIN. Access granted.\n");
            return 0;
        }
        else
        {
            attempts++;
            if (attempts < max_attempts)
                printf("Incorrect PIN. Attempts left: %d\n", max_attempts - attempts);
        }
    }

    printf("Account locked due to 3 failed attempts.\n");
    return 0;
}
