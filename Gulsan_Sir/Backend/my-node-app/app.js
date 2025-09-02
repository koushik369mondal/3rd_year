const express = require('express');
const app = express();
const port = 3000;

// Set EJS as the templating engine
app.set('view engine', 'ejs');

// Serve static files from the 'public' directory
app.use(express.static('public'));

// Define a route for the home page
app.get('/', (req, res) => {
    const title = "Welcome to EJS Templating";
    const message = "This is your first EJS application!";
    const items = ['Item 1', 'Item 2', 'Item 3'];

    // Render 'index.ejs' and pass data to the template
    res.render('index', { title: title, message: message, items: items });
});

// Start the server
app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`);
});