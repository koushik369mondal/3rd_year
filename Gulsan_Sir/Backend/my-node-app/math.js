const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;
const divide = (a, b) => a / b;

module.exports = { add, subtract, multiply, divide };

console.log("Addition:", add(2, 3));
console.log("Subtraction:", subtract(5, 2));
console.log("Multiplication:", multiply(3, 4));
console.log("Division:", divide(10, 2));