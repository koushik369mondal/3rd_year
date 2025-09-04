const express = require('express');
const app = express();
const port = 3000;

// Middleware to parse incoming request bodies (for form data)
app.use(express.urlencoded({ extended: true }));

// Route to serve HTML form
app.get('/', (req, res) => {
    res.send(`
        <form action="/submit" method="POST">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <button type="submit">Submit</button>
        </form>
    `);
});

// Route to handle POST request
app.post('/submit', (req, res) => {
    const name = req.body.name;
    res.send(`Hello, ${name}! Your form was submitted successfully.`);
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});