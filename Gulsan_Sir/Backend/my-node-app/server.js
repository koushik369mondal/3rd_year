const http = require("http");
const server = http.createServer((req, res) => {
    // Write response header (status code and content type)
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    // Send a response body
    res.write('Hello, World! This is my first web server.');
    // End the response
    res.end();
});
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server is running and listening on port ${PORT}`);
});