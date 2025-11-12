const readline = require('readline');

// Create interface for user input
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("--- Simple Calculator ---");

rl.question("Enter first number: ", (num1) => {
    rl.question("Enter operator (+, -, *, /): ", (op) => {
        rl.question("Enter second number: ", (num2) => {
            num1 = parseFloat(num1);
            num2 = parseFloat(num2);
            let result;

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    result = num2 !== 0 ? num1 / num2 : "Error: Division by zero";
                    break;
                default:
                    result = "Invalid operator!";
            }

            console.log(`Result: ${result}`);
            rl.close();
        });
    });
});
