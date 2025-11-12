const fs = require('fs');

// Data to write
const data = "Hello! This text is written to a file using Node.js.";

// Write data to a file named 'output.txt'
fs.writeFile('output.txt', data, (err) => {
    if (err) {
        console.error("❌ Error writing file:", err);
    } else {
        console.log("✅ Data written successfully to output.txt");
    }
});