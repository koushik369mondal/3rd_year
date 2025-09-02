const express = require('express');
const app = express();
const port = 3000;

// Set EJS as the templating engine
app.set('view engine', 'ejs');

// Serve static files from the 'public' directory
app.use(express.static('public'));

app.get('/', (req, res) => {
    res.send('Home Page');
});
app.get('/about', (req, res) => {
    res.send('About Page');
});
app.get('/contact', (req, res) => {
    res.send('Contact Page');
});

app.get('/users/:id', (req, res) => {
    res.send(`User ID: ${req.params.id}`);
});

// Remove the app.get('*', ...) line and replace with:
app.use((req, res) => {
    res.status(404).send('404 Page Not Found');
});

// Start the server
app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`);
});