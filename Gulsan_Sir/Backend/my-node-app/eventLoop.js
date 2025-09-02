console.log("Start of the program");
// Simulating a synchronous task
for (let i = 0; i < 3; i++) {
    console.log(`Synchronous Task: ${i}`);
}
// Simulating an asynchronous task using setTimeout
setTimeout(() => {
    console.log("Asynchronous Task 1: Timeout after 2000ms");
}, 2000);
setTimeout(() => {
    console.log("Asynchronous Task 2: Timeout after 0ms");
}, 0);
// Simulating a synchronous task
console.log("End of the program");