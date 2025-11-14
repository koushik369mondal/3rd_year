const fs = require('fs');

// Read Data 
const data = fs.ReadStream('report.txt', 'utf8');
data.on('data', (chunk) => {
    console.log('Received chunk:', chunk);
});