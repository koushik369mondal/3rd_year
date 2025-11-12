function slowFunction() {
    for (let i = 0; i < 1e8; i++); 
}

console.log("Starting...");
slowFunction();
console.log("Done!");
