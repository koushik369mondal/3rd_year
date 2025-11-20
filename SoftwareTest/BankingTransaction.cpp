/*Q. Develop a C program that performs deposit and withdrawal operations on a bank account.
Implement validation for invalid amounts and transaction limits.
Write at least 10 test cases covering valid and invalid deposit and withdrawal scenarios.
Include Test Case IDs, inputs, expected outputs, and final balance.*/




#include <stdio.h>

int main() {
    float balance = 20000;   // Initial balance
    float amount;
    int choice;

    while (1) {
        printf("\n--- Simple Bank Operations ---\n");
        printf("1. Deposit Money\n");
        printf("2. Withdraw Money\n");
        printf("3. Check Balance\n");
        printf("4. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            printf("Enter amount to deposit: ");
            scanf("%f", &amount);

            if (amount <= 0) {
                printf("Invalid amount!\n");
            } 
            else if (amount > 50000) {
                printf("Deposit limit exceeded! (Max 50000)\n");
            } 
            else {
                balance += amount;
                printf("Deposit successful! New balance: %.2f\n", balance);
            }
            break;

        case 2:
            printf("Enter amount to withdraw: ");
            scanf("%f", &amount);

            if (amount <= 0) {
                printf("Invalid amount!\n");
            } 
            else if (amount > balance) {
                printf("Insufficient balance!\n");
            } 
            else {
                balance -= amount;
                printf("Withdrawal successful! New balance: %.2f\n", balance);
            }
            break;

        case 3:
            printf("Current Balance: %.2f\n", balance);
            break;

        case 4:
            printf("Exiting program...\n");
            return 0;

        default:
            printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}

